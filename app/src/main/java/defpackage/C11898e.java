package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11898e implements InterfaceC10540e, InterfaceC0665e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f23835e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f23836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23837e;

    public /* synthetic */ C11898e() {
        this.f23837e = 0;
    }

    public /* synthetic */ C11898e(InterfaceC10540e interfaceC10540e, InterfaceC7224e interfaceC7224e, int i) {
        this.f23837e = i;
        this.f23836e = interfaceC10540e;
        this.f23835e = interfaceC7224e;
    }

    private final void Signature() {
    }

    private final void adcel() {
    }

    private final void admob() {
    }

    private final void ads() {
    }

    private final void advert() {
    }

    private final void amazon() {
    }

    private final void applovin() {
    }

    private final void billing() {
    }

    /* renamed from: class, reason: not valid java name */
    private final void m3281class() {
    }

    private final void crashlytics() {
    }

    /* renamed from: extends, reason: not valid java name */
    private final void m3282extends() {
    }

    private final void firebase() {
    }

    /* renamed from: goto, reason: not valid java name */
    private final void m3283goto() {
    }

    private final void inmobi() {
    }

    /* renamed from: interface, reason: not valid java name */
    private final void m3284interface() {
    }

    private final void isPro() {
    }

    private final void isVip() {
    }

    private final void loadAd() {
    }

    private final void mopub() {
    }

    /* renamed from: native, reason: not valid java name */
    private final void m3285native() {
    }

    private final void premium() {
    }

    private final void pro() {
    }

    private final void purchase() {
    }

    private final void remoteconfig() {
    }

    private final void signatures() {
    }

    private final void subs() {
    }

    private final void subscription() {
    }

    private final void tapsense() {
    }

    /* renamed from: this, reason: not valid java name */
    private final void m3286this() {
    }

    private final void yandex() {
    }

    @Override // defpackage.InterfaceC0665e
    public final void ad() {
        switch (this.f23837e) {
            case 0:
                appmetrica(EnumC10668e.f21011e);
                this.f23835e = EnumC10668e.f21009e;
                Iterator it = AbstractC13480e.m3607transient((Collection) ((Iterable) this.f23836e)).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).ad();
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }

    public void appmetrica(EnumC10668e enumC10668e) {
        if (((EnumC10668e) this.f23835e) == enumC10668e) {
            return;
        }
        throw new IllegalStateException(("Expected state " + enumC10668e + " but was " + ((EnumC10668e) this.f23835e)).toString());
    }

    @Override // defpackage.InterfaceC10540e
    public EnumC10668e getState() {
        return (EnumC10668e) this.f23835e;
    }

    @Override // defpackage.InterfaceC0665e
    public final void license() {
        switch (this.f23837e) {
            case 0:
                appmetrica(EnumC10668e.f21009e);
                this.f23835e = EnumC10668e.f21011e;
                Iterator it = ((Iterable) this.f23836e).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).license();
                }
                return;
            case 1:
            case 2:
                return;
            case 3:
                ((InterfaceC10540e) this.f23836e).startapp(this);
                C9289e c9289e = (C9289e) this.f23835e;
                AbstractC5336e.purchase(c9289e.appmetrica, null, 0, new C11662e(c9289e, null, 1), 3);
                return;
            case 4:
                ((InterfaceC10540e) this.f23836e).startapp(this);
                C4837e c4837e = (C4837e) this.f23835e;
                AbstractC5336e.purchase(c4837e.billing, null, 0, new C0145e(c4837e, null, 0), 3);
                return;
            case 5:
                ((InterfaceC10540e) this.f23836e).startapp(this);
                C1925e c1925e = (C1925e) this.f23835e;
                AbstractC5336e.purchase(c1925e.appmetrica, null, 0, new C1732e(c1925e, null, 1), 3);
                return;
            default:
                ((InterfaceC10540e) this.f23836e).startapp(this);
                C0073e c0073e = (C0073e) this.f23835e;
                AbstractC5336e.purchase(c0073e.license, null, 0, new C8514e(c0073e, null, 1), 3);
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void metrica() {
        switch (this.f23837e) {
            case 0:
                appmetrica(EnumC10668e.f21008e);
                this.f23835e = EnumC10668e.f21011e;
                Iterator it = AbstractC13480e.m3607transient((Collection) ((Iterable) this.f23836e)).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).metrica();
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onCreate() {
        switch (this.f23837e) {
            case 0:
                appmetrica(EnumC10668e.f21010e);
                this.f23835e = EnumC10668e.f21009e;
                Iterator it = ((Iterable) this.f23836e).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).onCreate();
                }
                return;
            case 1:
                ((InterfaceC10540e) this.f23836e).startapp(this);
                C5609e c5609e = ((C13867e) this.f23835e).license;
                ArrayList billing = AbstractC1831e.vip().billing();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(billing, 10));
                Iterator it2 = billing.iterator();
                while (it2.hasNext()) {
                    C11048e c11048e = (C11048e) it2.next();
                    arrayList.add(new C6475e(c11048e.ad, c11048e.metrica, c11048e.vip));
                }
                c5609e.subscription(AbstractC8228e.metrica(arrayList));
                return;
            case 2:
                ((InterfaceC10540e) this.f23836e).startapp(this);
                C13389e c13389e = (C13389e) this.f23835e;
                AbstractC5336e.purchase(c13389e.appmetrica, null, 0, new C17071e(c13389e, null, 3), 3);
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onDestroy() {
        switch (this.f23837e) {
            case 0:
                appmetrica(EnumC10668e.f21009e);
                this.f23835e = EnumC10668e.f21012e;
                Iterator it = AbstractC13480e.m3607transient((Collection) ((Iterable) this.f23836e)).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).onDestroy();
                }
                this.f23836e = C3295e.f7451e;
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.InterfaceC10540e
    public void smaato(InterfaceC0665e interfaceC0665e) {
        if (this.f23836e.contains(interfaceC0665e)) {
            throw new IllegalStateException("Already subscribed");
        }
        this.f23836e = AbstractC4511e.Signature(this.f23836e, interfaceC0665e);
        EnumC10668e enumC10668e = (EnumC10668e) this.f23835e;
        if (enumC10668e.compareTo(EnumC10668e.f21009e) >= 0) {
            interfaceC0665e.onCreate();
        }
        if (enumC10668e.compareTo(EnumC10668e.f21011e) >= 0) {
            interfaceC0665e.license();
        }
        if (enumC10668e.compareTo(EnumC10668e.f21008e) >= 0) {
            interfaceC0665e.vip();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.InterfaceC10540e
    public void startapp(InterfaceC0665e interfaceC0665e) {
        this.f23836e = AbstractC4511e.advert(this.f23836e, interfaceC0665e);
    }

    @Override // defpackage.InterfaceC0665e
    public final void vip() {
        switch (this.f23837e) {
            case 0:
                appmetrica(EnumC10668e.f21011e);
                this.f23835e = EnumC10668e.f21008e;
                Iterator it = ((Iterable) this.f23836e).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0665e) it.next()).vip();
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return;
        }
    }
}
