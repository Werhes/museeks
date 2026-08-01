package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: eٜؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0025e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12816e f1162e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1163e;

    public /* synthetic */ C0025e(C12816e c12816e, int i) {
        this.f1163e = i;
        this.f1162e = c12816e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1163e) {
            case 0:
                return ((InterfaceC2460e) obj).license(this.f1162e);
            default:
                C12816e c12816e = (C12816e) obj;
                return Boolean.valueOf(!c12816e.ad.metrica() && c12816e.vip().equals(this.f1162e));
        }
    }
}
