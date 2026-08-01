package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4468e extends AbstractC7674e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f9677e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9678e;

    public /* synthetic */ C4468e(int i, Object obj) {
        this.f9678e = i;
        this.f9677e = obj;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f9678e) {
            case 0:
                if (obj == null ? true : obj instanceof C18352e) {
                    return super.contains((C18352e) obj);
                }
                return false;
            default:
                return ((C9780e) this.f9677e).containsValue(obj);
        }
    }

    public C18352e firebase(int i) {
        Matcher matcher = ((C14031e) this.f9677e).ad;
        C15926e admob = AbstractC3062e.admob(matcher.start(i), matcher.end(i));
        if (admob.f22523e >= 0) {
            return new C18352e(matcher.group(i), admob);
        }
        return null;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection
    public boolean isEmpty() {
        switch (this.f9678e) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9678e) {
            case 0:
                return new C7321e(new C2167e(new C1356e(1, AbstractC6874e.purchase(this)), new C6846e(7, this)));
            default:
                C9709e c9709e = ((C9780e) this.f9677e).f19326e;
                AbstractC13502e[] abstractC13502eArr = new AbstractC13502e[8];
                for (int i = 0; i < 8; i++) {
                    abstractC13502eArr[i] = new C6783e(2);
                }
                return new AbstractC14140e(c9709e, abstractC13502eArr);
        }
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        switch (this.f9678e) {
            case 0:
                return ((C14031e) this.f9677e).ad.groupCount() + 1;
            default:
                C9780e c9780e = (C9780e) this.f9677e;
                c9780e.getClass();
                return c9780e.f19325e;
        }
    }
}
