package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9190e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3566e f18364e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18365e;

    public /* synthetic */ C9190e(C3566e c3566e, int i) {
        this.f18365e = i;
        this.f18364e = c3566e;
    }

    public /* synthetic */ C9190e(C3566e c3566e, int i, int i2) {
        this.f18365e = i2;
        this.f18364e = c3566e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        String str;
        int i2;
        int i3;
        switch (this.f18365e) {
            case 0:
                C3566e c3566e = this.f18364e;
                C0576e c0576e = c3566e.f8045e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    boolean booleanValue = ((Boolean) c0576e.getValue()).booleanValue();
                    InterfaceC8615e interfaceC8615e = c3566e.f8041e;
                    boolean billing = c13770e.billing(booleanValue);
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (billing || m3681throw == c5170e) {
                        Integer metrica = interfaceC8615e.metrica();
                        if (metrica != null) {
                            i = metrica.intValue();
                        } else {
                            boolean vip = interfaceC8615e.vip();
                            boolean booleanValue2 = ((Boolean) c0576e.getValue()).booleanValue();
                            i = vip ? booleanValue2 ? R.drawable.ic_like_36 : R.drawable.ic_check : booleanValue2 ? R.drawable.ic_like_outline_36 : R.drawable.ic_add;
                        }
                        m3681throw = Integer.valueOf(i);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC10727e metrica2 = AbstractC12475e.metrica(((Number) m3681throw).intValue(), 0, c13770e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (m3681throw2 == c5170e) {
                        m3681throw2 = Integer.valueOf(interfaceC8615e.vip() ? R.string.action_audio_remove : R.string.action_audio_add);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC5647e.vip(metrica2, AbstractC5297e.appmetrica(c13770e, ((Number) m3681throw2).intValue()), null, 0L, c13770e, 8, 12);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f18364e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                this.f18364e.crashlytics((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C3566e c3566e2 = this.f18364e;
                    long purchase = c3566e2.f8043e.purchase();
                    if (purchase == 0) {
                        i2 = 770555461;
                        i3 = R.string.library_remove_cache_toggle_not_downloaded;
                    } else if (purchase == -1) {
                        i2 = 770558785;
                        i3 = R.string.library_remove_cache_toggle_processing;
                    } else if (purchase == -2) {
                        i2 = 770561986;
                        i3 = R.string.library_remove_cache_toggle_unavailable;
                    } else {
                        c13770e2.m3676strictfp(770565199);
                        c13770e2.Signature(false);
                        str = (String) c3566e2.f8046e.getValue();
                        AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                    }
                    str = AbstractC4653e.isVip(c13770e2, i2, i3, c13770e2, false);
                    AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
