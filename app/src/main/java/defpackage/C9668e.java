package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* renamed from: eٍۖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9668e extends Permission {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final HashSet f19162e;

    public C9668e(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f19162e = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9668e) && this.f19162e.equals(((C9668e) obj).f19162e);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.f19162e.toString();
    }

    public final int hashCode() {
        return this.f19162e.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof C9668e)) {
            return false;
        }
        C9668e c9668e = (C9668e) permission;
        return getName().equals(c9668e.getName()) || this.f19162e.containsAll(c9668e.f19162e);
    }
}
