package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7297e implements InterfaceC13460e {
    public final int ad;
    public final float appmetrica;
    public final String billing;
    public final C3089e license;
    public final List metrica;
    public final String purchase;
    public final int vip;

    public C7297e(int i, int i2, List list, C3089e c3089e, float f, String str, String str2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = list;
        this.license = c3089e;
        this.appmetrica = f;
        this.purchase = str;
        this.billing = str2;
    }

    @Override // defpackage.InterfaceC13460e
    public final boolean ad() {
        return this.vip != -1;
    }

    @Override // defpackage.InterfaceC13460e
    public final C3089e adcel() {
        return this.license;
    }

    @Override // defpackage.InterfaceC13460e
    public final int appmetrica() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC13460e
    public final boolean billing() {
        return this.purchase != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7297e)) {
            return false;
        }
        C7297e c7297e = (C7297e) obj;
        return this.ad == c7297e.ad && this.vip == c7297e.vip && Objects.equals(this.metrica, c7297e.metrica) && Objects.equals(this.license, c7297e.license) && Float.valueOf(this.appmetrica).equals(Float.valueOf(c7297e.appmetrica)) && Objects.equals(this.purchase, c7297e.purchase) && Objects.equals(this.billing, c7297e.billing);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), Integer.valueOf(this.vip), this.metrica, this.license, Float.valueOf(this.appmetrica), this.purchase, this.billing);
    }

    @Override // defpackage.InterfaceC13460e
    public final int license() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC13460e
    public final List metrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC13460e
    public final String mopub() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC13460e
    public final boolean purchase() {
        return this.license != null;
    }

    @Override // defpackage.InterfaceC13460e
    public final float startapp() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC13460e
    public final boolean vip() {
        return !Float.isNaN(this.appmetrica);
    }

    @Override // defpackage.InterfaceC13460e
    public final boolean yandex() {
        return this.metrica != null;
    }
}
