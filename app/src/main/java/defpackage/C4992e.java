package defpackage;

import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4992e implements Comparator, j$.util.Comparator {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10569e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C4992e f10568e = new C4992e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C4992e f10567e = new C4992e(1);

    public /* synthetic */ C4992e(int i) {
        this.f10569e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10569e) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator reversed() {
        switch (this.f10569e) {
            case 0:
                return f10567e;
            default:
                return f10568e;
        }
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i = this.f10569e;
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function) {
        java.util.Comparator a;
        int i = this.f10569e;
        a = Comparator.EL.a(this, Comparator.CC.comparing(function));
        return a;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        java.util.Comparator a;
        int i = this.f10569e;
        a = Comparator.EL.a(this, Comparator.CC.comparing(function, comparator));
        return a;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i = this.f10569e;
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i = this.f10569e;
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i = this.f10569e;
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }
}
