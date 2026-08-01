package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12171e extends AbstractC10298e {
    public final String ad;
    public final byte[] license;
    public final C2394e metrica;
    public final C1622e vip;

    public C12171e(String str, C1622e c1622e, C2394e c2394e) {
        this.ad = str;
        this.vip = c1622e;
        this.metrica = c2394e;
        Charset ad = AbstractC9757e.ad(c1622e);
        this.license = AbstractC1266e.appmetrica(str, ad == null ? AbstractC5508e.ad : ad);
    }

    @Override // defpackage.AbstractC14601e
    public final Long ad() {
        return Long.valueOf(this.license.length);
    }

    @Override // defpackage.AbstractC10298e
    public final byte[] appmetrica() {
        return this.license;
    }

    @Override // defpackage.AbstractC14601e
    public final C2394e license() {
        return this.metrica;
    }

    public final String toString() {
        return "TextContent[" + this.vip + "] \"" + AbstractC5304e.m1860finally(30, this.ad) + '\"';
    }

    @Override // defpackage.AbstractC14601e
    public final C1622e vip() {
        return this.vip;
    }
}
