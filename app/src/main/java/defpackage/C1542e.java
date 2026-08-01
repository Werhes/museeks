package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1542e extends C17455e {
    public int smaato;

    public C1542e(AbstractC17471e abstractC17471e) {
        super(abstractC17471e);
        if (abstractC17471e instanceof C9586e) {
            this.appmetrica = 2;
        } else {
            this.appmetrica = 3;
        }
    }

    @Override // defpackage.C17455e
    public final void license(int i) {
        if (this.adcel) {
            return;
        }
        this.adcel = true;
        this.billing = i;
        Iterator it = this.mopub.iterator();
        while (it.hasNext()) {
            InterfaceC12462e interfaceC12462e = (InterfaceC12462e) it.next();
            interfaceC12462e.ad(interfaceC12462e);
        }
    }
}
