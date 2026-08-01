package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14796e implements InterfaceC13460e {
    public final int ad;
    public final float appmetrica;
    public final String billing;
    public final C3089e license;
    public final List metrica;
    public final String purchase;
    public final String startapp;
    public final int vip;
    public final String yandex;

    public C14796e(int i, int i2, List list, C3089e c3089e, float f, String str, String str2, String str3, String str4) {
        this.ad = i;
        this.vip = i2;
        this.metrica = list;
        this.license = c3089e;
        this.appmetrica = f;
        this.purchase = str;
        this.billing = str2;
        this.yandex = str3;
        this.startapp = str4;
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
        return this.billing != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14796e)) {
            return false;
        }
        C14796e c14796e = (C14796e) obj;
        return this.ad == c14796e.ad && this.vip == c14796e.vip && Objects.equals(this.metrica, c14796e.metrica) && Objects.equals(this.license, c14796e.license) && Float.valueOf(this.appmetrica).equals(Float.valueOf(c14796e.appmetrica)) && Objects.equals(this.purchase, c14796e.purchase) && Objects.equals(this.billing, c14796e.billing) && Objects.equals(this.yandex, c14796e.yandex) && Objects.equals(this.startapp, c14796e.startapp);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.ad), Integer.valueOf(this.vip), this.metrica, this.license, Float.valueOf(this.appmetrica), this.purchase, this.billing, this.yandex, this.startapp);
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
        return this.billing;
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
