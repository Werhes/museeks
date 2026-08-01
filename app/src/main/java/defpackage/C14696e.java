package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14696e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f29114e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f29115e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29116e;

    public /* synthetic */ C14696e(Object obj, long j, int i) {
        this.f29116e = i;
        this.f29114e = obj;
        this.f29115e = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29116e) {
            case 0:
                return ((AbstractC9876e) ((AbstractC4457e) this.f29114e)).metrica(this.f29115e);
            case 1:
                C12318e c12318e = ((C7838e) this.f29114e).f15864e;
                if (c12318e == null) {
                    return null;
                }
                c12318e.admob(this.f29115e);
                return Unit.INSTANCE;
            default:
                String str = (String) this.f29114e;
                C13664e c13664e = C13664e.f27089e;
                return new C12380e(str, this.f29115e, new C3168e((C12569e) null, new C16675e(100, c13664e, c13664e)));
        }
    }
}
