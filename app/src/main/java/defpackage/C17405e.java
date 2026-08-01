package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17405e {
    public static final LinkedHashSet ad = AbstractC4511e.Signature(C16628e.loadAd("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet appmetrica;
    public static final LinkedHashSet billing;
    public static final LinkedHashSet license;
    public static final LinkedHashSet metrica;
    public static final LinkedHashSet purchase;
    public static final LinkedHashSet vip;

    static {
        List<EnumC8790e> startapp = AbstractC6874e.startapp(EnumC8790e.BOOLEAN, EnumC8790e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC8790e enumC8790e : startapp) {
            C12816e c12816e = enumC8790e.f17704e;
            if (c12816e == null) {
                EnumC8790e.ad(15);
                throw null;
            }
            String vip2 = c12816e.ad.billing().vip();
            String[] strArr = {enumC8790e.f17703e + "Value()" + enumC8790e.metrica()};
            String concat = "java/lang/".concat(vip2);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(concat + '.' + str);
            }
            AbstractC13480e.inmobi(linkedHashSet, linkedHashSet2);
        }
        vip = AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(linkedHashSet, C16628e.loadAd("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C16628e.amazon("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C16628e.amazon("Double", "isInfinite()Z", "isNaN()Z")), C16628e.amazon("Float", "isInfinite()Z", "isNaN()Z")), C16628e.amazon("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C16628e.amazon("CharSequence", "isEmpty()Z"));
        metrica = C16628e.loadAd("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        license = AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(AbstractC4511e.loadAd(C16628e.amazon("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C16628e.loadAd("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C16628e.amazon("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C16628e.amazon("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C16628e.loadAd("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C16628e.loadAd("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C16628e.loadAd("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        appmetrica = AbstractC4511e.loadAd(AbstractC4511e.loadAd(C16628e.loadAd("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C16628e.loadAd("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C16628e.loadAd("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC8790e enumC8790e2 = EnumC8790e.BYTE;
        List startapp2 = AbstractC6874e.startapp(EnumC8790e.BOOLEAN, enumC8790e2, EnumC8790e.DOUBLE, EnumC8790e.FLOAT, enumC8790e2, EnumC8790e.INT, EnumC8790e.LONG, EnumC8790e.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = startapp2.iterator();
        while (it.hasNext()) {
            C12816e c12816e2 = ((EnumC8790e) it.next()).f17704e;
            if (c12816e2 == null) {
                EnumC8790e.ad(15);
                throw null;
            }
            String vip3 = c12816e2.ad.billing().vip();
            String[] mopub = C16628e.mopub("Ljava/lang/String;");
            AbstractC13480e.inmobi(linkedHashSet3, C16628e.amazon(vip3, (String[]) Arrays.copyOf(mopub, mopub.length)));
        }
        String[] mopub2 = C16628e.mopub("D");
        LinkedHashSet loadAd = AbstractC4511e.loadAd(linkedHashSet3, C16628e.amazon("Float", (String[]) Arrays.copyOf(mopub2, mopub2.length)));
        String[] mopub3 = C16628e.mopub("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        purchase = AbstractC4511e.loadAd(loadAd, C16628e.amazon("String", (String[]) Arrays.copyOf(mopub3, mopub3.length)));
        String[] mopub4 = C16628e.mopub("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        billing = C16628e.amazon("Throwable", (String[]) Arrays.copyOf(mopub4, mopub4.length));
    }
}
