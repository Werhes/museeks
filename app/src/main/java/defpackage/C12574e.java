package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12574e implements InterfaceC18244e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ ServiceC13230e vip;

    public /* synthetic */ C12574e(ServiceC13230e serviceC13230e, int i) {
        this.ad = i;
        this.vip = serviceC13230e;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؚؑ۟, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, eؑۖؒ] */
    @Override // defpackage.InterfaceC18244e
    public final ListenableFuture apply(Object obj) {
        Object obj2;
        switch (this.ad) {
            case 0:
                C8802e c8802e = (C8802e) obj;
                AbstractC2301e.amazon(c8802e, "LibraryResult must not be null");
                ?? obj3 = new Object();
                if (c8802e.ad != 0 || (obj2 = c8802e.metrica) == null) {
                    obj3.smaato(null);
                } else {
                    C1962e c1962e = (C1962e) obj2;
                    byte[] bArr = c1962e.license.mopub;
                    if (bArr == null) {
                        obj3.smaato(AbstractC13256e.ad(c1962e, null));
                    } else {
                        ListenableFuture smaato = this.vip.f26249e.smaato.smaato(bArr);
                        RunnableC3709e runnableC3709e = new RunnableC3709e(obj3, smaato, 0);
                        EnumC3320e enumC3320e = EnumC3320e.f7489e;
                        obj3.ad(runnableC3709e, enumC3320e);
                        smaato.ad(new RunnableC4904e(23, smaato, (Object) obj3, c1962e), enumC3320e);
                    }
                }
                return obj3;
            default:
                return ServiceC13230e.ad(this.vip, (C8802e) obj);
        }
    }
}
