package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18183e implements InterfaceC8524e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f35608e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f35609e;

    public C18183e(PlaybackService playbackService) {
        this.f35608e = playbackService;
    }

    @Override // defpackage.InterfaceC8524e
    public final void Signature(int i) {
        AbstractC6232e.billing(new C7385e(i != 0 ? i != 1 ? EnumC10286e.f20305e : EnumC10286e.f20304e : EnumC10286e.f20307e), this.f35608e.f36734e);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: abstract */
    public final /* synthetic */ void mo1480abstract(C5298e c5298e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void admob(float f) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void ads(C8256e c8256e) {
        C14609e adcel;
        AbstractC14966e.ad(AbstractC11575e.vip(this), 6, "Exo exception: " + c8256e.f16770e + " (" + c8256e.vip() + ") - " + c8256e.getMessage() + ']', null);
        c8256e.printStackTrace();
        PlaybackService playbackService = this.f35608e;
        C18464e c18464e = playbackService.f36743e;
        if (c18464e == null) {
            c18464e = null;
        }
        C1962e mo2113e = ((AbstractC11130e) c18464e.f36191e).mo2113e();
        Object obj = (mo2113e == null || (adcel = PlaybackService.advert().f15868e.adcel(mo2113e.ad)) == null) ? null : adcel.vip;
        InterfaceC14776e interfaceC14776e = obj instanceof InterfaceC14776e ? (InterfaceC14776e) obj : null;
        if (interfaceC14776e == null || !interfaceC14776e.ad()) {
            C18464e c18464e2 = playbackService.f36743e;
            (c18464e2 != null ? c18464e2 : null).loadAd();
        } else {
            C18464e c18464e3 = playbackService.f36743e;
            (c18464e3 != null ? c18464e3 : null).mo2080e();
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void amazon(C17750e c17750e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void appmetrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: break */
    public final /* synthetic */ void mo1481break(C4194e c4194e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: case */
    public final /* synthetic */ void mo1482case(int i, int i2) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: class */
    public final /* synthetic */ void mo1484class(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void crashlytics(C8256e c8256e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: default */
    public final void mo1485default(C5251e c5251e) {
        this.f35609e = c5251e.metrica;
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: extends */
    public final /* synthetic */ void mo1486extends() {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: final */
    public final /* synthetic */ void mo1487final(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void firebase(int i, boolean z) {
        AbstractC5336e.purchase(this.f35608e.f36734e, null, 0, new C11143e(i, this, (InterfaceC5083e) null), 3);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: goto */
    public final /* synthetic */ void mo1488goto(C12053e c12053e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: implements */
    public final /* synthetic */ void mo1489implements(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: interface */
    public final /* synthetic */ void mo1491interface(C12053e c12053e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void isPro(C9039e c9039e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void isVip(boolean z) {
        AbstractC6232e.billing(new C17820e(z), this.f35608e.f36734e);
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void license(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void loadAd(int i, boolean z) {
        if (i == 1) {
            PlaybackService playbackService = this.f35608e;
            AbstractC5336e.purchase(playbackService.f36734e, null, 0, new C13575e(z, playbackService, (InterfaceC5083e) null, 3), 3);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void metrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void mopub(C4491e c4491e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: native */
    public final void mo1492native(AbstractC6690e abstractC6690e, int i) {
        if (i == 0) {
            C11800e c11800e = PlaybackService.advert().f15868e;
            int loadAd = abstractC6690e.loadAd();
            ArrayList arrayList = new ArrayList(loadAd);
            for (int i2 = 0; i2 < loadAd; i2++) {
                arrayList.add(abstractC6690e.smaato(i2, new C11501e(), 0L).metrica);
            }
            C12328e c12328e = c11800e.startapp;
            c12328e.purchase();
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C1962e) it.next()).ad);
            }
            c12328e.metrica(AbstractC13480e.premium(arrayList2));
            AbstractC6232e.billing(new C14547e(PlaybackService.advert().f15868e.purchase()), this.f35608e.f36734e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void premium(C18255e c18255e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void pro(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void purchase(C0101e c0101e, C0101e c0101e2, int i) {
        PlaybackService playbackService = this.f35608e;
        C14826e c14826e = playbackService.f36734e;
        InterfaceC5083e interfaceC5083e = null;
        if (c0101e.vip != c0101e2.vip) {
            if (i == 0) {
                AbstractC5336e.purchase(c14826e, null, 0, new C0162e(playbackService, c0101e2, c0101e, interfaceC5083e, 0), 3);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                AbstractC5336e.purchase(c14826e, null, 0, new C0162e(playbackService, c0101e2, c0101e, interfaceC5083e, 1), 3);
                return;
            }
        }
        if (i == 1) {
            AbstractC5336e.purchase(c14826e, null, 0, new C0990e(playbackService, interfaceC5083e, 6), 3);
            Handler handler = playbackService.f36737e;
            handler.removeMessages(1);
            handler.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void signatures(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void smaato(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void startapp(C3335e c3335e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void subs(InterfaceC16843e interfaceC16843e, C3164e c3164e) {
        C11715e c11715e = c3164e.ad;
        boolean ad = c11715e.ad(7, 4);
        PlaybackService playbackService = this.f35608e;
        if (ad) {
            int i = PlaybackService.f36732e;
            int billing = interfaceC16843e.billing();
            EnumC11342e enumC11342e = (billing == 2 || billing == 3) ? interfaceC16843e.mo2108e() ? EnumC11342e.f22808e : EnumC11342e.f22807e : EnumC11342e.f22810e;
            Iterator it = PlaybackService.advert().f15866e.iterator();
            while (it.hasNext()) {
                InterfaceC3974e interfaceC3974e = (InterfaceC3974e) it.next();
                int i2 = PlaybackService.f36732e;
                interfaceC3974e.vip(enumC11342e);
                Unit unit = Unit.INSTANCE;
            }
            AbstractC6232e.billing(new C12920e(enumC11342e, interfaceC16843e.billing() == 2), playbackService.f36734e);
            Handler handler = playbackService.f36737e;
            if (interfaceC16843e.billing() != 2 && (interfaceC16843e.billing() != 3 || !interfaceC16843e.mo2108e())) {
                handler.removeMessages(1);
                RunnableC12991e runnableC12991e = playbackService.f36746e;
                if (runnableC12991e != null) {
                    handler.removeCallbacks(runnableC12991e);
                }
                playbackService.f36746e = null;
            } else if (playbackService.f36746e == null) {
                playbackService.subs();
                handler.sendEmptyMessageDelayed(1, 60000L);
            }
        }
        if (c11715e.ad(11, 1, 5)) {
            int i3 = PlaybackService.f36732e;
            playbackService.startapp(interfaceC16843e);
        }
        if (c11715e.ad(1)) {
            PlaybackService.license(playbackService, interfaceC16843e);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final void subscription(int i, C1962e c1962e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: this */
    public final /* synthetic */ void mo1499this(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: throw */
    public final /* synthetic */ void mo1500throw(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: try */
    public final /* synthetic */ void mo1502try(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void vip(C2351e c2351e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: while */
    public final /* synthetic */ void mo1503while(List list) {
    }
}
