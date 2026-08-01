package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17422e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11379e f34136e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34137e;

    public /* synthetic */ C17422e(C11379e c11379e, int i) {
        this.f34137e = i;
        this.f34136e = c11379e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f34137e;
        C0115e c0115e = C0115e.f1276e;
        C11379e c11379e = this.f34136e;
        int i2 = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    float f = 16;
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.eq3_legacy_bass_boost_warning), AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, f, 0.0f, 8, 5), AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).purchase, c13770e, 48, 0, 131064);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.eq3_legacy_bass_boost_warning_description), AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).mopub, c13770e, 48, 0, 131068);
                    boolean yandex = c13770e.yandex(c11379e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C2463e(c11379e, 0);
                        c13770e.m3682throws(m3681throw);
                    }
                    InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.mopub(c0115e, f), 1.0f);
                    C3924e c3924e = AbstractC0903e.purchase(c13770e).metrica;
                    C16005e c16005e = AbstractC10244e.ad;
                    AbstractC1513e.ad((Function0) m3681throw, metrica, false, c3924e, AbstractC10244e.ad(AbstractC0903e.license(c13770e).amazon, AbstractC0903e.license(c13770e).admob, 0L, 0L, c13770e, 12), null, null, null, AbstractC17416e.metrica, c13770e, 805306416, 484);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AbstractC0865e.ad(AbstractC12220e.mopub(c0115e, 16), null, null, null, null, AbstractC16653e.license(-553153611, new C17422e(c11379e, i2), c13770e2), c13770e2, 196614, 30);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
