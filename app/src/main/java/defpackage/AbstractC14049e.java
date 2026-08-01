package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14049e {
    public AbstractC14049e ad(C7589e c7589e, C0404e c0404e, long j, long j2, long j3) {
        throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
    }

    public C11106e appmetrica() {
        return null;
    }

    public abstract AbstractC14049e billing(C0404e c0404e);

    public boolean license() {
        return false;
    }

    public C0763e metrica() {
        return null;
    }

    public C0763e purchase(C7589e c7589e) {
        return metrica();
    }

    public void startapp(C0763e c0763e) {
    }

    public boolean vip() {
        return this instanceof C4039e;
    }

    public abstract AbstractC14049e yandex();
}
