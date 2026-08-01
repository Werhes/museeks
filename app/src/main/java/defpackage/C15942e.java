package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15942e extends AbstractC17557e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f31401e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31402e;

    public /* synthetic */ C15942e(int i, Object obj) {
        this.f31402e = i;
        this.f31401e = obj;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f31402e) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f31402e) {
            case 0:
                String group = ((C14031e) this.f31401e).ad.group(i);
                return group == null ? BuildConfig.FLAVOR : group;
            default:
                return ((List) this.f31401e).get(AbstractC13480e.tapsense(i, this));
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f31402e) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f31402e) {
            case 1:
                return new C0053e(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f31402e) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public ListIterator listIterator() {
        switch (this.f31402e) {
            case 1:
                return new C0053e(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f31402e) {
            case 1:
                return new C0053e(this, i);
            default:
                return super.listIterator(i);
        }
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        switch (this.f31402e) {
            case 0:
                return ((C14031e) this.f31401e).ad.groupCount() + 1;
            default:
                return ((List) this.f31401e).size();
        }
    }
}
