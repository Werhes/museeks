package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17345e extends AbstractC11062e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C10675e f34029e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ClassLoader f34031e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C18511e f34032e = AbstractC11062e.f21949e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C5363e f34030e = new C5363e(new C13465e(20, this));

    static {
        String str = C10675e.f21023e;
        f34029e = C10215e.license("/", false);
    }

    public C17345e(ClassLoader classLoader) {
        this.f34031e = classLoader;
    }

    /* renamed from: catch, reason: not valid java name */
    public static String m4306catch(C10675e c10675e) {
        C10675e c10675e2 = f34029e;
        c10675e2.getClass();
        return purchase.vip(c10675e2, c10675e, true).license(c10675e2).f21024e.remoteconfig();
    }

    @Override // defpackage.AbstractC11062e
    public final InterfaceC0274e ad(C10675e c10675e) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC11062e
    public final List ads(C10675e c10675e) {
        String m4306catch = m4306catch(c10675e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.f34030e.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            C6571e c6571e = (C6571e) it.next();
            AbstractC11062e abstractC11062e = (AbstractC11062e) c6571e.f13544e;
            C10675e c10675e2 = (C10675e) c6571e.f13543e;
            List ads = abstractC11062e.ads(c10675e2.appmetrica(m4306catch));
            if (ads != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : ads) {
                    if (C10068e.vip((C10675e) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C10068e.purchase((C10675e) it2.next(), c10675e2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                AbstractC13480e.inmobi(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return AbstractC13480e.m3575continue(linkedHashSet);
        }
        return null;
    }

    @Override // defpackage.AbstractC11062e
    public final void advert(C10675e c10675e) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: break */
    public final InterfaceC0274e mo1914break(C10675e c10675e, boolean z) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: extends */
    public final C0058e mo1916extends(C10675e c10675e) {
        if (!C10068e.vip(c10675e)) {
            throw new FileNotFoundException("file not found: " + c10675e);
        }
        String m4306catch = m4306catch(c10675e);
        for (C6571e c6571e : (List) this.f34030e.getValue()) {
            try {
                return ((AbstractC11062e) c6571e.f13544e).mo1916extends(((C10675e) c6571e.f13543e).appmetrica(m4306catch));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c10675e);
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: goto */
    public final C15308e mo1917goto(C10675e c10675e) {
        if (!C10068e.vip(c10675e)) {
            return null;
        }
        String m4306catch = m4306catch(c10675e);
        for (C6571e c6571e : (List) this.f34030e.getValue()) {
            C15308e mo1917goto = ((AbstractC11062e) c6571e.f13544e).mo1917goto(((C10675e) c6571e.f13543e).appmetrica(m4306catch));
            if (mo1917goto != null) {
                return mo1917goto;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: implements */
    public final InterfaceC2537e mo1918implements(C10675e c10675e) {
        if (!C10068e.vip(c10675e)) {
            throw new FileNotFoundException("file not found: " + c10675e);
        }
        C10675e c10675e2 = f34029e;
        c10675e2.getClass();
        URL resource = this.f34031e.getResource(purchase.vip(c10675e2, c10675e, false).license(c10675e2).f21024e.remoteconfig());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + c10675e);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        return AbstractC8636e.appmetrica(openConnection.getInputStream());
    }

    @Override // defpackage.AbstractC11062e
    public final List inmobi(C10675e c10675e) {
        String m4306catch = m4306catch(c10675e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C6571e c6571e : (List) this.f34030e.getValue()) {
            AbstractC11062e abstractC11062e = (AbstractC11062e) c6571e.f13544e;
            C10675e c10675e2 = (C10675e) c6571e.f13543e;
            try {
                List inmobi = abstractC11062e.inmobi(c10675e2.appmetrica(m4306catch));
                ArrayList arrayList = new ArrayList();
                for (Object obj : inmobi) {
                    if (C10068e.vip((C10675e) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C10068e.purchase((C10675e) it.next(), c10675e2));
                }
                AbstractC13480e.inmobi(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return AbstractC13480e.m3575continue(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c10675e);
    }

    @Override // defpackage.AbstractC11062e
    public final void license(C10675e c10675e, C10675e c10675e2) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC11062e
    public final void loadAd(C10675e c10675e, boolean z) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: protected */
    public final C0058e mo1919protected(C10675e c10675e) {
        throw new IOException("resources are not writable");
    }
}
