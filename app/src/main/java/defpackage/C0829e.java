package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0829e implements InterfaceC1425e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C7936e f3213e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C14267e f3214e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f3219e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AbstractC11095e f3220e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f3218e = new ArrayList();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f3216e = false;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f3215e = false;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f3217e = false;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f3213e = new C7936e(2);
    }

    public C0829e(int i) {
        this.f3219e = i;
    }

    public final long Signature() {
        if (this.f3215e) {
            return this.f3220e.f21996e.longValue() - 8;
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        return purchase().ad(enumC8271e, strArr);
    }

    @Override // defpackage.InterfaceC9354e
    public final Iterator adcel() {
        return purchase().adcel();
    }

    public final void admob() {
        boolean z = purchase() instanceof C14267e;
        C7936e c7936e = f3213e;
        if (z) {
            try {
                AbstractC7014e it = AbstractC5689e.f12082e.iterator();
                while (it.hasNext()) {
                    EnumC8271e enumC8271e = (EnumC8271e) it.next();
                    String str = (String) this.f3214e.appmetrica(enumC8271e).appmetrica(BuildConfig.FLAVOR);
                    if (!str.isEmpty()) {
                        AbstractC11095e abstractC11095e = this.f3220e;
                        if (str.endsWith("\u0000")) {
                            str = str.substring(0, str.length() - 1);
                        }
                        abstractC11095e.mopub(enumC8271e, str);
                    } else if (billing(enumC8271e)) {
                        this.f3220e.inmobi(enumC8271e);
                    }
                }
                return;
            } catch (C12795e unused) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i = C1724e.ad;
                return;
            }
        }
        try {
            AbstractC7014e it2 = AbstractC5689e.f12082e.iterator();
            while (it2.hasNext()) {
                EnumC8271e enumC8271e2 = (EnumC8271e) it2.next();
                if (!this.f3220e.firebase(enumC8271e2).isEmpty()) {
                    C14267e c14267e = this.f3214e;
                    String firebase = this.f3220e.firebase(enumC8271e2);
                    if (!firebase.endsWith("\u0000")) {
                        firebase = firebase.concat("\u0000");
                    }
                    c14267e.mopub(enumC8271e2, firebase);
                } else if (billing(enumC8271e2)) {
                    C14267e c14267e2 = this.f3214e;
                    c14267e2.getClass();
                    AbstractC5542e.license(enumC8271e2, "genericKey");
                    if (!C14267e.f28201e.contains(enumC8271e2)) {
                        throw new C14803e(enumC8271e2.name(), 17, (byte) 0);
                    }
                    c14267e2.yandex(enumC8271e2.name());
                } else {
                    continue;
                }
            }
        } catch (C12795e unused2) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        return purchase().advert(abstractC13977e);
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return purchase().amazon();
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        return purchase().appmetrica(enumC8271e);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        return purchase().billing(enumC8271e);
    }

    public final boolean equals(Object obj) {
        return purchase().equals(obj);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean isEmpty() {
        return purchase() == null || purchase().isEmpty();
    }

    @Override // defpackage.InterfaceC9354e
    public final int license() {
        return purchase().license();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        AbstractC5542e.license(abstractC13977e, "artwork");
        smaato(advert(abstractC13977e));
        return this;
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        return purchase().metrica(EnumC8271e.COVER_ART);
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        smaato(ad(enumC8271e, strArr));
        return this;
    }

    public final InterfaceC1425e purchase() {
        switch (AbstractC8703e.m2467class(this.f3219e)) {
            case 0:
            case 4:
                return this.f3220e;
            case 1:
            case 5:
                return this.f3214e;
            case 2:
            case 6:
                return (this.f3215e || !this.f3217e) ? this.f3220e : this.f3214e;
            case 3:
            case 7:
                return (this.f3217e || !this.f3215e) ? this.f3214e : this.f3220e;
            default:
                return this.f3220e;
        }
    }

    @Override // defpackage.InterfaceC1425e
    public final void smaato(InterfaceC3589e interfaceC3589e) {
        purchase().smaato(interfaceC3589e);
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e startapp(EnumC8271e enumC8271e) {
        return appmetrica(enumC8271e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f3218e.iterator();
        while (it.hasNext()) {
            sb.append(((C15116e) it.next()).toString());
            sb.append("\n");
        }
        if (this.f3220e != null) {
            sb.append("Wav ID3 Tag:\n");
            if (this.f3215e) {
                sb.append("\tstartLocation:");
                sb.append(AbstractC6069e.ad(Signature()));
                sb.append("\n\tendLocation:");
                sb.append(AbstractC6069e.ad(yandex()));
                sb.append("\n");
            }
            sb.append(this.f3220e.toString());
            sb.append("\n");
        }
        C14267e c14267e = this.f3214e;
        if (c14267e != null) {
            sb.append(c14267e.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean vip() {
        return purchase().vip();
    }

    public final long yandex() {
        if (this.f3215e) {
            return this.f3220e.f21997e.longValue();
        }
        return 0L;
    }
}
