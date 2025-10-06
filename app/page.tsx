
//'use client';
import { HelloWorldComponent as HelloWorld } from "../public/js/cljs/hello_world.core.js";
//import { HelloWorld } from "../public/js/cljs/hello-world.js";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-center p-24">
      <h1 className="text-4xl font-bold text-center">Welcome to Next.js + ClojureScript!</h1>
      <HelloWorld name="Joao frango" />
    </main>
  );
}