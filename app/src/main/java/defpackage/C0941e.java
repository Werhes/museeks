package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0941e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3357e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3358e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3359e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f3360e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3361e = 0;

    public /* synthetic */ C0941e(C14623e c14623e, C3566e c3566e, boolean z, boolean z2) {
        this.f3360e = c14623e;
        this.f3357e = c3566e;
        this.f3359e = z;
        this.f3358e = z2;
    }

    public /* synthetic */ C0941e(boolean z, C15274e c15274e, C17085e c17085e, boolean z2) {
        this.f3359e = z;
        this.f3360e = c15274e;
        this.f3357e = c17085e;
        this.f3358e = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3361e;
        boolean z = this.f3358e;
        Object obj4 = this.f3357e;
        Object obj5 = this.f3360e;
        char c = 1;
        int i2 = 0;
        switch (i) {
            case 0:
                C14623e c14623e = (C14623e) obj5;
                C3566e c3566e = (C3566e) obj4;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC6401e.vip(AbstractC16653e.license(-1013403986, new C17630e(c14623e, c3566e, 6), c13770e), AbstractC16653e.license(1417346479, new C15147e(c14623e, this.f3359e, i2), c13770e), AbstractC12220e.mopub(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16), AbstractC16653e.license(1983880113, new C15147e(z, c3566e, c == true ? 1 : 0), c13770e), c13770e, 3510, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C15274e c15274e = (C15274e) obj5;
                C17085e c17085e = (C17085e) obj4;
                Function2 function2 = (Function2) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.yandex(function2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C8094e c8094e = C8094e.ad;
                    c13770e2.m3676strictfp(1691265870);
                    c13770e2.Signature(false);
                    c13770e2.m3676strictfp(1691490155);
                    c13770e2.Signature(false);
                    C1299e c1299e = C1299e.ad;
                    InterfaceC16154e ad = AbstractC8949e.ad(c13770e2, AbstractC17572e.vip);
                    C16005e metrica = C8094e.metrica(c8094e);
                    boolean z2 = this.f3359e;
                    c8094e.ad(BuildConfig.FLAVOR, function2, z2, c15274e, null, null, null, ad, c17085e, metrica, AbstractC16653e.license(-1197464330, new C9623e(i2, c17085e, z2, z), c13770e2), c13770e2, ((intValue2 << 3) & 112) | 27648);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
