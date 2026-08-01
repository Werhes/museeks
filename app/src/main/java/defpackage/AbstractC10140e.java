package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10140e implements Cloneable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC11202e f20053e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC11202e f20054e;

    public AbstractC10140e(AbstractC11202e abstractC11202e) {
        this.f20054e = abstractC11202e;
        if (abstractC11202e.adcel()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f20053e = (AbstractC11202e) abstractC11202e.startapp(4, null);
    }

    public final void ad() {
        if (this.f20053e.adcel()) {
            return;
        }
        AbstractC11202e abstractC11202e = (AbstractC11202e) this.f20054e.startapp(4, null);
        C11222e.metrica.ad(abstractC11202e.getClass()).vip(abstractC11202e, this.f20053e);
        this.f20053e = abstractC11202e;
    }

    public final Object clone() {
        AbstractC10140e abstractC10140e = (AbstractC10140e) this.f20054e.startapp(5, null);
        abstractC10140e.f20053e = vip();
        return abstractC10140e;
    }

    public final AbstractC11202e metrica() {
        AbstractC11202e vip = vip();
        vip.getClass();
        boolean z = true;
        byte byteValue = ((Byte) vip.startapp(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean purchase = C11222e.metrica.ad(vip.getClass()).purchase(vip);
                vip.startapp(2, true == purchase ? vip : null);
                z = purchase;
            }
        }
        if (z) {
            return vip;
        }
        throw new C14803e("Message was missing required fields.  (Lite runtime could not determine which fields were missing).", 19, (byte) 0);
    }

    public final AbstractC11202e vip() {
        if (!this.f20053e.adcel()) {
            return this.f20053e;
        }
        AbstractC11202e abstractC11202e = this.f20053e;
        abstractC11202e.getClass();
        C11222e.metrica.ad(abstractC11202e.getClass()).yandex(abstractC11202e);
        abstractC11202e.mopub();
        return this.f20053e;
    }
}
