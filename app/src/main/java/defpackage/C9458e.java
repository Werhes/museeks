package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9458e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0576e f18799e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18800e;

    public /* synthetic */ C9458e(C0576e c0576e, int i) {
        this.f18800e = i;
        this.f18799e = c0576e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18800e;
        C5170e c5170e = C2987e.ad;
        C0576e c0576e = this.f18799e;
        int i2 = 1;
        int i3 = 2;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = AbstractC11992e.ad;
                    C8872e ad = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e, 510);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    boolean purchase = c13770e.purchase(c0576e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == c5170e) {
                        m3681throw = new C2899e(2, c0576e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC1266e.ad, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, AbstractC16653e.license(-89763818, new C9458e(c0576e, i2), c13770e), null, AbstractC16653e.license(1403420500, new C9458e(c0576e, i3), c13770e), ad, 0.0f, 0.0f, c13770e, 199686, 404);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c13770e2.m3659default();
                } else if (((Boolean) c0576e.getValue()).booleanValue()) {
                    c13770e2.m3676strictfp(1610786023);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.libtools_merge_playlist_invert_text_on), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3676strictfp(1610923942);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.libtools_merge_playlist_invert_text_off), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    c13770e2.Signature(false);
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean booleanValue = ((Boolean) c0576e.getValue()).booleanValue();
                    boolean purchase2 = c13770e3.purchase(c0576e);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (purchase2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C17955e(27, c0576e);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC8844e.ad(booleanValue, (Function1) m3681throw2, null, false, null, c13770e3, 0, 124);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
