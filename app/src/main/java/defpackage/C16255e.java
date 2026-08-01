package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16255e implements InterfaceC4868e {
    public final InterfaceC12424e ad;
    public C6815e appmetrica;
    public final AbstractC13757e license;
    public EnumC4033e metrica;
    public boolean purchase = false;
    public final C1326e vip;

    public C16255e(InterfaceC12424e interfaceC12424e, C1326e c1326e, AbstractC13757e abstractC13757e) {
        this.ad = interfaceC12424e;
        this.vip = c1326e;
        this.license = abstractC13757e;
        synchronized (this) {
            this.metrica = (EnumC4033e) c1326e.license();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eٍؚؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC4868e
    public final void ad(Object obj) {
        EnumC13278e enumC13278e = (EnumC13278e) obj;
        EnumC13278e enumC13278e2 = EnumC13278e.f26333e;
        EnumC4033e enumC4033e = EnumC4033e.f8970e;
        if (enumC13278e == enumC13278e2 || enumC13278e == EnumC13278e.f26334e || enumC13278e == EnumC13278e.f26335e || enumC13278e == EnumC13278e.f26338e) {
            vip(enumC4033e);
            if (this.purchase) {
                this.purchase = false;
                C6815e c6815e = this.appmetrica;
                if (c6815e != null) {
                    c6815e.cancel(false);
                    this.appmetrica = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((enumC13278e == EnumC13278e.f26340e || enumC13278e == EnumC13278e.f26339e || enumC13278e == EnumC13278e.f26337e) && !this.purchase) {
            vip(enumC4033e);
            ArrayList arrayList = new ArrayList();
            InterfaceC12424e interfaceC12424e = this.ad;
            RunnableC3397e remoteconfig = AbstractC15792e.remoteconfig(C6815e.vip(AbstractC5750e.purchase(new C18070e(this, interfaceC12424e, arrayList))), new C4946e(this), AbstractC3062e.billing());
            C4946e c4946e = new C4946e(this);
            RunnableC3397e remoteconfig2 = AbstractC15792e.remoteconfig(remoteconfig, new C17974e(11, c4946e), AbstractC3062e.billing());
            this.appmetrica = remoteconfig2;
            ?? obj2 = new Object();
            obj2.f3321e = this;
            obj2.f3323e = arrayList;
            obj2.f3322e = interfaceC12424e;
            remoteconfig2.ad(new RunnableC17144e(remoteconfig2, (Object) obj2, 0), AbstractC3062e.billing());
            this.purchase = true;
        }
    }

    @Override // defpackage.InterfaceC4868e
    public final void onError(Throwable th) {
        C6815e c6815e = this.appmetrica;
        if (c6815e != null) {
            c6815e.cancel(false);
            this.appmetrica = null;
        }
        vip(EnumC4033e.f8970e);
    }

    public final void vip(EnumC4033e enumC4033e) {
        synchronized (this) {
            try {
                if (this.metrica.equals(enumC4033e)) {
                    return;
                }
                this.metrica = enumC4033e;
                AbstractC9464e.yandex("StreamStateObserver", "Update Preview stream state to " + enumC4033e);
                this.vip.adcel(enumC4033e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
