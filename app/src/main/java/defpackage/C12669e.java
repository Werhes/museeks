package defpackage;

import java.io.Serializable;
import java.util.Vector;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12669e implements Cloneable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object f25396e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Vector f25397e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C12669e f25399e = null;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f25398e = true;

    public C12669e(C18529e c18529e) {
        this.f25396e = c18529e;
    }

    public final void ad(C12669e c12669e) {
        if (c12669e.f25399e == this) {
            vip(c12669e, (this.f25397e != null ? r0.size() : 0) - 1);
        } else {
            Vector vector = this.f25397e;
            vip(c12669e, vector != null ? vector.size() : 0);
        }
    }

    public final Object clone() {
        try {
            C12669e c12669e = (C12669e) super.clone();
            c12669e.f25397e = null;
            c12669e.f25399e = null;
            return c12669e;
        } catch (CloneNotSupportedException e) {
            throw new Error(e.toString());
        }
    }

    public final boolean metrica(C12669e c12669e) {
        Vector vector = this.f25397e;
        return (vector == null ? 0 : vector.size()) != 0 && c12669e.f25399e == this;
    }

    public final String toString() {
        Object obj = this.f25396e;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public final void vip(C12669e c12669e, int i) {
        if (!this.f25398e) {
            throw new IllegalStateException("node does not allow children");
        }
        C12669e c12669e2 = this;
        while (c12669e2 != c12669e) {
            c12669e2 = c12669e2.f25399e;
            if (c12669e2 == null) {
                C12669e c12669e3 = c12669e.f25399e;
                if (c12669e3 != null) {
                    if (!c12669e3.metrica(c12669e)) {
                        throw new IllegalArgumentException("argument is not a child");
                    }
                    int indexOf = !c12669e3.metrica(c12669e) ? -1 : c12669e3.f25397e.indexOf(c12669e);
                    Vector vector = c12669e3.f25397e;
                    if (vector == null) {
                        throw new ArrayIndexOutOfBoundsException("node has no children");
                    }
                    C12669e c12669e4 = (C12669e) vector.elementAt(indexOf);
                    c12669e3.f25397e.removeElementAt(indexOf);
                    c12669e4.f25399e = null;
                }
                c12669e.f25399e = this;
                if (this.f25397e == null) {
                    this.f25397e = new Vector();
                }
                this.f25397e.insertElementAt(c12669e, i);
                return;
            }
        }
        throw new IllegalArgumentException("new child is an ancestor");
    }
}
