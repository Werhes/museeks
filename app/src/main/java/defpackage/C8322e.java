package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۤٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8322e extends AbstractC16982e {
    public final C0576e license = AbstractC14533e.startapp(null);
    public final C15816e metrica;

    public C8322e(C15816e c15816e) {
        this.metrica = c15816e;
    }

    @Override // defpackage.AbstractC16982e
    public final boolean ad(C15816e c15816e) {
        return c15816e == this.metrica;
    }

    @Override // defpackage.AbstractC16982e
    public final Object vip(C15816e c15816e) {
        if (c15816e != this.metrica) {
            AbstractC14070e.metrica("Check failed.");
        }
        Object value = this.license.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    public final void yandex(C15816e c15816e, Object obj) {
        if (c15816e != this.metrica) {
            AbstractC14070e.metrica("Check failed.");
        }
        this.license.setValue(obj);
    }
}
