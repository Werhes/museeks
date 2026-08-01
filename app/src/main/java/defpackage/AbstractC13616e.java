package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13616e implements InterfaceC5077e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public AbstractC13616e f27011e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C14194e f27012e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f27013e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f27014e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f27015e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f27016e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C14826e f27017e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public AbstractC17732e f27018e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f27019e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f27021e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C5028e f27023e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AbstractC13616e f27024e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public AbstractC13616e f27022e = this;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f27020e = -1;

    /* renamed from: eَؑۨ */
    public void mo338e() {
    }

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final InterfaceC18435e m3623e() {
        C14826e c14826e = this.f27017e;
        if (c14826e != null) {
            return c14826e;
        }
        C14826e ad = AbstractC9743e.ad(((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getCoroutineContext().mo394const(new C6799e((InterfaceC10500e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(this)).getCoroutineContext().mo397public(C4524e.f9798e))));
        this.f27017e = ad;
        return ad;
    }

    /* renamed from: eٍؖۙ */
    public void mo2043e(AbstractC17732e abstractC17732e) {
        this.f27018e = abstractC17732e;
    }

    /* renamed from: eؘٕۚ */
    public void mo2044e() {
        if (!this.f27016e) {
            AbstractC14070e.metrica("Cannot detach a node that is not attached");
        }
        if (this.f27019e) {
            AbstractC14070e.metrica("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f27013e) {
            AbstractC14070e.metrica("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f27016e = false;
        C14826e c14826e = this.f27017e;
        if (c14826e != null) {
            AbstractC9743e.license(c14826e, new AbstractC4233e("The Modifier.Node was detached", 2));
            this.f27017e = null;
        }
    }

    /* renamed from: eؚؚؓ */
    public boolean mo293e() {
        return !(this instanceof C10127e);
    }

    /* renamed from: eٍۢؒ */
    public void mo2045e() {
        if (!this.f27016e) {
            AbstractC14070e.metrica("reset() called on an unattached node");
        }
        mo338e();
    }

    /* renamed from: eُۘٙ */
    public /* synthetic */ void mo713e() {
    }

    /* renamed from: eؙِۡ */
    public void mo2046e() {
        if (!this.f27016e) {
            AbstractC14070e.metrica("node detached multiple times");
        }
        if (this.f27018e == null) {
            AbstractC14070e.metrica("detach invoked on a node without a coordinator");
        }
        if (!this.f27013e) {
            AbstractC14070e.metrica("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f27013e = false;
        C14194e c14194e = this.f27012e;
        if (c14194e != null) {
            c14194e.invoke();
        }
        mo228e();
    }

    /* renamed from: eّْٝ */
    public void mo228e() {
    }

    /* renamed from: eْۢؕ */
    public void mo2048e(AbstractC13616e abstractC13616e) {
        this.f27022e = abstractC13616e;
    }

    /* renamed from: eٍٓۢ */
    public void mo2049e() {
        if (!this.f27016e) {
            AbstractC14070e.metrica("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f27019e) {
            AbstractC14070e.metrica("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f27019e = false;
        mo229e();
        this.f27013e = true;
    }

    /* renamed from: eٕؓٝ */
    public void mo2051e() {
        if (this.f27016e) {
            AbstractC14070e.metrica("node attached multiple times");
        }
        if (this.f27018e == null) {
            AbstractC14070e.metrica("attach invoked on a node without a coordinator");
        }
        this.f27016e = true;
        this.f27019e = true;
    }

    /* renamed from: eؘٖؗ */
    public /* synthetic */ void mo1339e() {
    }

    /* renamed from: e٘ٔ٘ */
    public void mo229e() {
    }
}
