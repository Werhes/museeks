package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۘٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0520e implements Comparable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f2666e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f2667e;

    public C0520e(String str, boolean z) {
        if (str == null) {
            ad(0);
            throw null;
        }
        this.f2667e = str;
        this.f2666e = z;
    }

    public static /* synthetic */ void ad(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C0520e appmetrica(String str) {
        if (str != null) {
            return new C0520e(str, false);
        }
        ad(5);
        throw null;
    }

    public static C0520e billing(String str) {
        if (str == null) {
            ad(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C0520e(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public static C0520e license(String str) {
        if (str != null) {
            return str.startsWith("<") ? billing(str) : appmetrica(str);
        }
        ad(9);
        throw null;
    }

    public static boolean purchase(String str) {
        if (str == null) {
            ad(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2667e.compareTo(((C0520e) obj).f2667e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0520e)) {
            return false;
        }
        C0520e c0520e = (C0520e) obj;
        return this.f2666e == c0520e.f2666e && this.f2667e.equals(c0520e.f2667e);
    }

    public final int hashCode() {
        return (this.f2667e.hashCode() * 31) + (this.f2666e ? 1 : 0);
    }

    public final String metrica() {
        if (this.f2666e) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String vip = vip();
        if (vip != null) {
            return vip;
        }
        ad(2);
        throw null;
    }

    public final String toString() {
        return this.f2667e;
    }

    public final String vip() {
        String str = this.f2667e;
        if (str != null) {
            return str;
        }
        ad(1);
        throw null;
    }
}
