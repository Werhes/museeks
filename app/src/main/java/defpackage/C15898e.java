package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15898e implements InterfaceC16718e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Serializable f31335e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f31336e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f31337e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f31338e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f31339e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f31340e;

    public C14918e ad() {
        C14911e c14911e = new C14911e();
        String str = (String) this.f31338e;
        return new C14918e((String) this.f31335e, str, (Set) this.f31336e, this.f31339e, new C1035e(AbstractC17861e.Signature("notifier-", str)), new C1035e(AbstractC17861e.Signature("writer-", str)), this.f31337e, (C14694e) this.f31340e, c14911e);
    }

    public void appmetrica(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty filename must be provided.");
        }
        String str2 = AbstractC6766e.ad;
        if (AbstractC5304e.inmobi(str, str2, false)) {
            throw new IllegalArgumentException(AbstractC17861e.subscription("Name cannot contain path separator '", str2, "': '", str, "'").toString());
        }
        if (str.equals(".realm")) {
            throw new IllegalArgumentException("'.realm' is not a valid filename");
        }
        this.f31338e = str;
    }

    public C10972e license() {
        InterfaceC1753e c15581e;
        C0309e c0309e = (C0309e) this.f31336e;
        if (c0309e.ad(null)) {
            try {
                c15581e = c0309e.vip();
            } catch (Throwable th) {
                c15581e = new C15581e(th);
            }
            if (c15581e.license()) {
                return new C10972e(c15581e, null, null, 6);
            }
            if (c15581e instanceof C15581e) {
                return ((C15581e) c15581e).ad;
            }
            ((CopyOnWriteArrayList) this.f31335e).add(c15581e);
            ((C14899e) this.f31338e).license().license(new C0870e(AbstractC16286e.vip + " connect " + c0309e.startapp.yandex.billing(), c15581e, this), 0L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x001e, B:13:0x0028, B:20:0x0054, B:64:0x0062, B:67:0x006f, B:25:0x0078, B:27:0x007e, B:31:0x0087, B:33:0x0092, B:34:0x0098, B:36:0x009c, B:41:0x00a3, B:44:0x00ad, B:46:0x00b1, B:49:0x00b7, B:50:0x00bb, B:52:0x00bf, B:53:0x00c0, B:56:0x00c4, B:69:0x0049, B:71:0x00cf, B:72:0x00d6), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x001e, B:13:0x0028, B:20:0x0054, B:64:0x0062, B:67:0x006f, B:25:0x0078, B:27:0x007e, B:31:0x0087, B:33:0x0092, B:34:0x0098, B:36:0x009c, B:41:0x00a3, B:44:0x00ad, B:46:0x00b1, B:49:0x00b7, B:50:0x00bb, B:52:0x00bf, B:53:0x00c0, B:56:0x00c4, B:69:0x0049, B:71:0x00cf, B:72:0x00d6), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x001e, B:13:0x0028, B:20:0x0054, B:64:0x0062, B:67:0x006f, B:25:0x0078, B:27:0x007e, B:31:0x0087, B:33:0x0092, B:34:0x0098, B:36:0x009c, B:41:0x00a3, B:44:0x00ad, B:46:0x00b1, B:49:0x00b7, B:50:0x00bb, B:52:0x00bf, B:53:0x00c0, B:56:0x00c4, B:69:0x0049, B:71:0x00cf, B:72:0x00d6), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0078 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC16718e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.C0177e metrica() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15898e.metrica():eًؑؕ");
    }

    @Override // defpackage.InterfaceC16718e
    public C0309e purchase() {
        return (C0309e) this.f31336e;
    }

    public void vip() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f31335e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC1753e interfaceC1753e = (InterfaceC1753e) it.next();
            interfaceC1753e.cancel();
            InterfaceC1753e appmetrica = interfaceC1753e.appmetrica();
            if (appmetrica != null) {
                ((C0309e) this.f31336e).Signature.addLast(appmetrica);
            }
        }
        copyOnWriteArrayList.clear();
    }
}
