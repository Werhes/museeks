package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5934e implements InterfaceC0665e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f12512e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12513e;

    public /* synthetic */ C5934e(int i, Object obj) {
        this.f12513e = i;
        this.f12512e = obj;
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

    private final void appmetrica() {
    }

    private final void billing() {
    }

    private final void inmobi() {
    }

    private final void isPro() {
    }

    private final void isVip() {
    }

    private final void loadAd() {
    }

    private final void mopub() {
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

    private final void smaato() {
    }

    private final void startapp() {
    }

    private final void subs() {
    }

    private final void subscription() {
    }

    private final void tapsense() {
    }

    private final void yandex() {
    }

    @Override // defpackage.InterfaceC0665e
    public final void ad() {
        switch (this.f12513e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((Function1) this.f12512e).invoke(EnumC10668e.f21009e);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void license() {
        switch (this.f12513e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((Function1) this.f12512e).invoke(EnumC10668e.f21011e);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void metrica() {
        switch (this.f12513e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((Function1) this.f12512e).invoke(EnumC10668e.f21011e);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onCreate() {
        switch (this.f12513e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((Function1) this.f12512e).invoke(EnumC10668e.f21009e);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onDestroy() {
        switch (this.f12513e) {
            case 0:
                ((C18070e) this.f12512e).license();
                return;
            case 1:
                Iterator it = new C11401e(((C0408e) ((C0909e) this.f12512e).f3321e).ad).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C0053e) it).f1190e;
                    if (!listIterator.hasPrevious()) {
                        return;
                    }
                    InterfaceC10306e interfaceC10306e = (InterfaceC10306e) listIterator.previous();
                    if (interfaceC10306e instanceof C7826e) {
                        C7826e c7826e = (C7826e) interfaceC10306e;
                        c7826e.billing.appmetrica();
                        AbstractC14520e.license(c7826e.license);
                    } else if (!(interfaceC10306e instanceof C1531e)) {
                        throw new C14803e(10);
                    }
                }
            case 2:
                AbstractC9743e.license((C14826e) this.f12512e, null);
                return;
            case 3:
                ((C16722e) this.f12512e).billing();
                return;
            case 4:
                ((Function1) this.f12512e).invoke(EnumC10668e.f21012e);
                return;
            default:
                C18464e c18464e = ((C2243e) this.f12512e).metrica;
                C8419e c8419e = (C8419e) c18464e.f36192e;
                if (c8419e != null) {
                    c8419e.Signature(null);
                }
                c18464e.f36192e = null;
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void vip() {
        switch (this.f12513e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((Function1) this.f12512e).invoke(EnumC10668e.f21008e);
                return;
            default:
                return;
        }
    }
}
