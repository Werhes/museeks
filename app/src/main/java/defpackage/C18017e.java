package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18017e {
    public final /* synthetic */ C10078e ad;

    public C18017e(C10078e c10078e) {
        this.ad = c10078e;
    }

    public final void ad() {
        Iterator it = new HashSet(this.ad.license).iterator();
        while (it.hasNext()) {
            ((C18017e) it.next()).ad();
        }
    }

    public final void appmetrica() {
        Iterator it = new HashSet(this.ad.license).iterator();
        while (it.hasNext()) {
            ((C18017e) it.next()).appmetrica();
        }
    }

    public final void license() {
        Iterator it = new HashSet(this.ad.license).iterator();
        while (it.hasNext()) {
            ((C18017e) it.next()).license();
        }
    }

    public final void metrica() {
        Iterator it = new HashSet(this.ad.license).iterator();
        while (it.hasNext()) {
            ((C18017e) it.next()).metrica();
        }
    }

    public final void purchase() {
        Iterator it = new HashSet(this.ad.license).iterator();
        while (it.hasNext()) {
            ((C18017e) it.next()).purchase();
        }
    }

    public final void vip(int i) {
        C10078e c10078e = this.ad;
        c10078e.appmetrica(i);
        c10078e.ad(i);
        Iterator it = new HashSet(c10078e.license).iterator();
        while (it.hasNext()) {
            ((C18017e) it.next()).vip(i);
        }
    }
}
