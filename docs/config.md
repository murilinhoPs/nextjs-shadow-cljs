# Render cljs component Nextjs

## First method

### React (page.tsx)

``` js
 import { HelloWorldComponent } from "../public/js/cljs/hello_world.core.js";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-center p-24">
      <h1 className="text-4xl font-bold text-center">Welcome to Next.js + ClojureScript!</h1>
      <HelloWorldComponent name="Joao josé lope sss" />
    </main>
  );
}
```

### shadow-cljs.edn

``` clj
{:source-paths ["src/cljs"]
 :deps {}
 :builds {:app {:target :npm-module
                :output-dir "public/js/cljs"
                :asset-path "public/js/cljs"
                :entries [hello-world.core]}}}
```

## Second method

### 2-React (page.tsx)

``` js
'use client'; // client-side
import { HelloWorld } from "../public/js/cljs/hello-world.js";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-center p-24">
      <h1 className="text-4xl font-bold text-center">Welcome to Next.js + ClojureScript!</h1>
      <div id="cljs-root" className="mt-8"></div>
      <HelloWorld name="Joao josé lopes jdjd" />
    </main>
  );
}
```

### 2-shadow-cljs.edn

``` clj
{:source-paths ["src/cljs"]
 :deps {}
 :builds {:app {:target :esm
                :output-dir "public/js/cljs"
                :asset-path "public/js/cljs"
                ;; exports HelloWorldComponent as HelloWorld 
                :modules {:hello-world {:entries [hello-world.core]
                                        :exports {HelloWorld hello-world.core/HelloWorldComponent}}}}}}
```
