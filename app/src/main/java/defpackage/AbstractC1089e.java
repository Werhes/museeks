package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1089e {
    public static final C10796e ad = new C10796e(EnumC7701e.f15627e, false);
    public static final LinkedHashMap license;
    public static final C10796e metrica;
    public static final C10796e vip;

    static {
        EnumC7701e enumC7701e = EnumC7701e.f15626e;
        vip = new C10796e(enumC7701e, false);
        metrica = new C10796e(enumC7701e, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        C11704e c11704e = new C11704e(1);
        new C3168e(c11704e, "java/util/".concat("Iterator"), 14).m1286transient("forEachRemaining", null, new C1191e(concat4, 0));
        new C3168e(c11704e, "java/lang/".concat("Iterable"), 14).m1286transient("spliterator", null, new C3801e(8));
        C3168e c3168e = new C3168e(c11704e, "java/util/".concat("Collection"), 14);
        c3168e.m1286transient("removeIf", null, new C1191e(concat2, 17));
        c3168e.m1286transient("stream", null, new C1191e(concat8, 26));
        c3168e.m1286transient("parallelStream", null, new C18446e(concat8, 1));
        C3168e c3168e2 = new C3168e(c11704e, "java/util/".concat("List"), 14);
        c3168e2.m1286transient("replaceAll", null, new C18446e(concat7, 2));
        c3168e2.m1286transient("addFirst", "2.1", new C18446e(concat, 3));
        c3168e2.m1286transient("addLast", "2.1", new C18446e(concat, 4));
        c3168e2.m1286transient("removeFirst", "2.1", new C18446e(concat, 5));
        c3168e2.m1286transient("removeLast", "2.1", new C18446e(concat, 6));
        C3168e c3168e3 = new C3168e(c11704e, "java/util/".concat("LinkedList"), 14);
        c3168e3.m1286transient("addFirst", "2.1", new C1191e(concat, 1));
        c3168e3.m1286transient("addLast", "2.1", new C1191e(concat, 2));
        c3168e3.m1286transient("removeFirst", "2.1", new C1191e(concat, 3));
        c3168e3.m1286transient("removeLast", "2.1", new C1191e(concat, 4));
        C3168e c3168e4 = new C3168e(c11704e, "java/util/".concat("LinkedHashSet"), 14);
        c3168e4.m1286transient("addFirst", "2.2", new C1191e(concat, 5));
        c3168e4.m1286transient("addLast", "2.2", new C1191e(concat, 6));
        c3168e4.m1286transient("removeFirst", "2.2", new C1191e(concat, 7));
        c3168e4.m1286transient("removeLast", "2.2", new C1191e(concat, 8));
        c3168e4.m1286transient("getFirst", "2.2", new C1191e(concat, 9));
        c3168e4.m1286transient("getLast", "2.2", new C1191e(concat, 10));
        C3168e c3168e5 = new C3168e(c11704e, "java/util/".concat("Map"), 14);
        c3168e5.m1286transient("forEach", null, new C1191e(concat6, 11));
        c3168e5.m1286transient("putIfAbsent", null, new C1191e(concat, 12));
        c3168e5.m1286transient("replace", null, new C1191e(concat, 13));
        c3168e5.m1286transient("replace", null, new C1191e(concat, 14));
        c3168e5.m1286transient("replaceAll", null, new C1191e(concat5, 15));
        c3168e5.m1286transient("compute", null, new C8601e(concat, 0, concat5));
        c3168e5.m1286transient("computeIfAbsent", null, new C8601e(concat, 1, concat3));
        c3168e5.m1286transient("computeIfPresent", null, new C8601e(concat, 2, concat5));
        c3168e5.m1286transient("merge", null, new C8601e(concat, 3, concat5));
        C3168e c3168e6 = new C3168e(c11704e, "java/util/".concat("LinkedHashMap"), 14);
        c3168e6.m1286transient("putFirst", "2.2", new C1191e(concat, 16));
        c3168e6.m1286transient("putLast", "2.2", new C1191e(concat, 18));
        C3168e c3168e7 = new C3168e(c11704e, concat9, 14);
        c3168e7.m1286transient("empty", null, new C1191e(concat9, 19));
        c3168e7.m1286transient("of", null, new C8601e(concat, 4, concat9));
        c3168e7.m1286transient("ofNullable", null, new C8601e(concat, 5, concat9));
        c3168e7.m1286transient("get", null, new C1191e(concat, 20));
        c3168e7.m1286transient("ifPresent", null, new C1191e(concat4, 21));
        new C3168e(c11704e, "java/lang/".concat("ref/Reference"), 14).m1286transient("get", null, new C1191e(concat, 22));
        new C3168e(c11704e, concat2, 14).m1286transient("test", null, new C1191e(concat, 23));
        new C3168e(c11704e, "java/util/function/".concat("BiPredicate"), 14).m1286transient("test", null, new C1191e(concat, 24));
        new C3168e(c11704e, concat4, 14).m1286transient("accept", null, new C1191e(concat, 25));
        new C3168e(c11704e, concat6, 14).m1286transient("accept", null, new C1191e(concat, 27));
        new C3168e(c11704e, concat3, 14).m1286transient("apply", null, new C1191e(concat, 28));
        new C3168e(c11704e, concat5, 14).m1286transient("apply", null, new C1191e(concat, 29));
        new C3168e(c11704e, "java/util/function/".concat("Supplier"), 14).m1286transient("get", null, new C18446e(concat, 0));
        license = c11704e.ad;
    }
}
