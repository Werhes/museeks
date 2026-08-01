package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11528e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14609e f23167e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23168e;

    public /* synthetic */ C11528e(C14609e c14609e, int i) {
        this.f23168e = 0;
        this.f23167e = c14609e;
    }

    public /* synthetic */ C11528e(C14609e c14609e, int i, byte b) {
        this.f23168e = i;
        this.f23167e = c14609e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23168e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5960e.ad(this.f23167e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC16049e abstractC16049e = this.f23167e.vip;
                    C15492e c15492e = AbstractC3577e.ad;
                    AbstractC8636e.ad(abstractC16049e, 0, ((C0896e) c13770e.adcel(c15492e)).license, ((C0896e) c13770e.adcel(c15492e)).ad, 0, 0.0f, false, null, null, null, c13770e, 0, 1010);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C14609e c14609e = this.f23167e;
                AbstractC16049e abstractC16049e2 = c14609e.vip;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String vip = abstractC16049e2.getVip();
                    boolean purchase = c13770e2.purchase(c14609e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        InterfaceC14424e interfaceC14424e = abstractC16049e2 instanceof InterfaceC14424e ? (InterfaceC14424e) abstractC16049e2 : null;
                        m3681throw = interfaceC14424e != null ? ((AudioTrack) interfaceC14424e).tapsense() : null;
                        c13770e2.m3682throws(m3681throw);
                    }
                    C15492e c15492e2 = AbstractC3577e.ad;
                    AbstractC6401e.metrica(vip, (String) m3681throw, ((C0896e) c13770e2.adcel(c15492e2)).ad, ((C0896e) c13770e2.adcel(c15492e2)).vip, null, c13770e2, 0, 16);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC14489e.vip(this.f23167e.vip.getMetrica(), null, ((C0896e) c13770e3.adcel(AbstractC3577e.ad)).ad, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e3, 0, 24960, 241658);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
