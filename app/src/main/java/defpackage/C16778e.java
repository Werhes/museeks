package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16778e implements InterfaceC8401e {
    public int ad;
    public float appmetrica;
    public String billing;
    public C3089e license;
    public List metrica;
    public String purchase;
    public String startapp;
    public int vip;
    public String yandex;

    @Override // defpackage.InterfaceC8401e
    public final InterfaceC8401e ad(C3089e c3089e) {
        this.license = c3089e;
        return this;
    }

    @Override // defpackage.InterfaceC8401e
    public final InterfaceC8401e appmetrica(List list) {
        this.metrica = list;
        return this;
    }

    @Override // defpackage.InterfaceC8401e
    public final InterfaceC8401e license(float f) {
        this.appmetrica = f;
        return this;
    }

    @Override // defpackage.InterfaceC8401e
    public final InterfaceC8401e metrica(int i) {
        this.ad = i;
        return this;
    }

    @Override // defpackage.InterfaceC8401e
    public final InterfaceC8401e purchase(String str) {
        this.billing = str;
        return this;
    }

    @Override // defpackage.InterfaceC8401e
    public final InterfaceC8401e vip(int i) {
        this.vip = i;
        return this;
    }
}
