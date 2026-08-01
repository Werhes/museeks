package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5884e implements InterfaceC11429e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f12432e;

    public AbstractC5884e(int i) {
        switch (i) {
            case 1:
                this.f12432e = new ArrayList();
                return;
            default:
                this.f12432e = new ArrayList();
                return;
        }
    }

    public boolean ad(int i, AbstractC3091e abstractC3091e, Object obj) {
        ArrayList license = abstractC3091e.license();
        boolean z = false;
        if (license != null) {
            int size = license.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = license.get(i2);
                if (obj2 instanceof C3155e) {
                    if (obj2.equals(obj)) {
                        vip(abstractC3091e.appmetrica(), abstractC3091e, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof AbstractC3091e)) {
                        throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                    }
                    if (ad(i, (AbstractC3091e) obj2, obj)) {
                        vip(abstractC3091e.appmetrica(), abstractC3091e, obj2);
                        return true;
                    }
                }
            }
        } else {
            if (!abstractC3091e.ad()) {
                vip(i, abstractC3091e, null);
                return true;
            }
            int metrica = abstractC3091e.metrica();
            int vip = abstractC3091e.vip();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if ((metrica <= intValue && intValue < vip) || (metrica == vip && metrica == number.intValue())) {
                    z = true;
                }
                if (z) {
                    vip(abstractC3091e.appmetrica(), abstractC3091e, null);
                }
                return z;
            }
        }
        return false;
    }

    public void appmetrica(int i, Object obj, AbstractC3091e abstractC3091e, Object obj2) {
        if (AbstractC7890e.billing(obj, C2987e.ad)) {
            vip(i, abstractC3091e, null);
        }
    }

    public AbstractC3091e billing(Object obj) {
        if (obj instanceof C3155e) {
            return purchase((C3155e) obj);
        }
        if (obj instanceof AbstractC3091e) {
            return (AbstractC3091e) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    @Override // defpackage.InterfaceC11429e
    /* renamed from: extends, reason: not valid java name */
    public void mo1988extends(C5302e c5302e) {
    }

    @Override // defpackage.InterfaceC11429e
    public InterfaceC15813e license(C11709e c11709e) {
        return null;
    }

    public abstract int metrica(C3155e c3155e);

    @Override // defpackage.InterfaceC11429e
    public void mopub() {
        yandex((String[]) this.f12432e.toArray(new String[0]));
    }

    @Override // defpackage.InterfaceC11429e
    public void pro(Object obj) {
        if (obj instanceof String) {
            this.f12432e.add((String) obj);
        }
    }

    public abstract AbstractC3091e purchase(C3155e c3155e);

    @Override // defpackage.InterfaceC11429e
    public void tapsense(C11709e c11709e, C0520e c0520e) {
    }

    public void vip(int i, AbstractC3091e abstractC3091e, Object obj) {
        this.f12432e.add(new C9350e(i, null, null));
    }

    public abstract void yandex(String[] strArr);
}
