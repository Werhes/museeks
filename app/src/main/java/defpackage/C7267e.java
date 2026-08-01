package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7267e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f14868e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14869e;

    public /* synthetic */ C7267e(int i, Function1 function1) {
        this.f14869e = i;
        this.f14868e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f14869e) {
            case 0:
                C11353e c11353e = (C11353e) obj;
                synchronized (AbstractC12909e.metrica) {
                    j = AbstractC12909e.appmetrica;
                    AbstractC12909e.appmetrica = 1 + j;
                }
                return new C9403e(j, c11353e, this.f14868e);
            case 1:
                return this.f14868e.invoke((AbstractC1186e) obj).toString();
            default:
                return this.f14868e.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
