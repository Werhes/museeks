package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7369e {
    public final String ad;
    public final Map vip;

    public C7369e(String str, Map map) {
        this.ad = str;
        this.vip = map;
    }

    public static C18540e ad(String str) {
        return new C18540e(str);
    }

    public static C7369e metrica(String str) {
        return new C7369e(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7369e)) {
            return false;
        }
        C7369e c7369e = (C7369e) obj;
        return this.ad.equals(c7369e.ad) && this.vip.equals(c7369e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.ad + ", properties=" + this.vip.values() + "}";
    }

    public final Annotation vip(Class cls) {
        return (Annotation) this.vip.get(cls);
    }
}
