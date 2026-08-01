package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12671e implements InterfaceC1425e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC11095e f25402e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f25403e = new ArrayList();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f25401e = false;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f25400e = false;

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        return this.f25402e.ad(enumC8271e, strArr);
    }

    @Override // defpackage.InterfaceC9354e
    public final Iterator adcel() {
        return this.f25402e.adcel();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        return this.f25402e.advert(abstractC13977e);
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        return this.f25402e.amazon();
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        return this.f25402e.appmetrica(enumC8271e);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        return this.f25402e.billing(enumC8271e);
    }

    public final boolean equals(Object obj) {
        return this.f25402e.equals(obj);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean isEmpty() {
        AbstractC11095e abstractC11095e = this.f25402e;
        return abstractC11095e == null || abstractC11095e.isEmpty();
    }

    @Override // defpackage.InterfaceC9354e
    public final int license() {
        return this.f25402e.license();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        AbstractC11095e abstractC11095e = this.f25402e;
        AbstractC5542e.license(abstractC13977e, "artwork");
        abstractC11095e.loadAd(abstractC13977e);
        return this;
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        return this.f25402e.metrica(EnumC8271e.COVER_ART);
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        smaato(this.f25402e.ad(enumC8271e, strArr));
        return this;
    }

    public final long purchase() {
        if (this.f25400e) {
            return this.f25402e.f21996e.longValue() - 8;
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC1425e
    public final void smaato(InterfaceC3589e interfaceC3589e) {
        this.f25402e.smaato(interfaceC3589e);
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e startapp(EnumC8271e enumC8271e) {
        return this.f25402e.appmetrica(enumC8271e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f25403e.iterator();
        while (it.hasNext()) {
            sb.append(((C15116e) it.next()).toString());
            sb.append("\n");
        }
        if (this.f25402e == null) {
            return "tag:empty";
        }
        sb.append("Aiff ID3 Tag:\n");
        if (this.f25400e) {
            if (this.f25401e) {
                sb.append("\tincorrectly starts as odd byte\n");
            }
            sb.append("\tstartLocation:");
            sb.append(AbstractC6069e.ad(purchase()));
            sb.append("\n\tendLocation:");
            sb.append(AbstractC6069e.ad(!this.f25400e ? 0L : this.f25402e.f21997e.longValue()));
            sb.append("\n");
        }
        sb.append(this.f25402e.toString());
        sb.append("\n");
        return sb.toString();
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean vip() {
        return this.f25402e.f31886e;
    }
}
