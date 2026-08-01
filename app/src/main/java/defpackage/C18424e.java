package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18424e {
    public final C18287e ad;
    public final Bundle appmetrica;
    public final InterfaceC10645e license;
    public final int metrica;
    public final int vip;

    public C18424e(C18287e c18287e, int i, int i2, boolean z, InterfaceC10645e interfaceC10645e, Bundle bundle) {
        this.ad = c18287e;
        this.vip = i;
        this.metrica = i2;
        this.license = interfaceC10645e;
        this.appmetrica = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18424e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C18424e c18424e = (C18424e) obj;
        InterfaceC10645e interfaceC10645e = c18424e.license;
        InterfaceC10645e interfaceC10645e2 = this.license;
        return (interfaceC10645e2 == null && interfaceC10645e == null) ? this.ad.equals(c18424e.ad) : Objects.equals(interfaceC10645e2, interfaceC10645e);
    }

    public final int hashCode() {
        return Objects.hash(this.license, this.ad);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        C18287e c18287e = this.ad;
        sb.append(c18287e.ad.ad);
        sb.append(", uid=");
        return AbstractC17861e.smaato(c18287e.ad.metrica, "}", sb);
    }
}
