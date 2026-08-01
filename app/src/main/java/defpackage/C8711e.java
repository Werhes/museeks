package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8711e implements InterfaceC9815e {
    public static final C17647e ad = new C17647e(26);
    public static final boolean vip;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r1.patch() >= 0) goto L20;
     */
    static {
        /*
            eٍ٘ؖ r0 = new eٍ٘ؖ
            r1 = 26
            r0.<init>(r1)
            defpackage.C8711e.ad = r0
            r0 = 0
            java.lang.String r1 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class<eًۣٙ> r2 = defpackage.AbstractC8309e.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L45
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Throwable -> L45
            boolean r1 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L45
            org.conscrypt.Conscrypt$Version r1 = org.conscrypt.Conscrypt.version()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L22
            goto L45
        L22:
            int r2 = r1.major()     // Catch: java.lang.Throwable -> L45
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L31
            int r1 = r1.major()     // Catch: java.lang.Throwable -> L45
            if (r1 <= r4) goto L45
            goto L44
        L31:
            int r2 = r1.minor()     // Catch: java.lang.Throwable -> L45
            if (r2 == r3) goto L3e
            int r1 = r1.minor()     // Catch: java.lang.Throwable -> L45
            if (r1 <= r3) goto L45
            goto L44
        L3e:
            int r1 = r1.patch()     // Catch: java.lang.Throwable -> L45
            if (r1 < 0) goto L45
        L44:
            r0 = r3
        L45:
            defpackage.C8711e.vip = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8711e.<clinit>():void");
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean ad() {
        return vip;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean license(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.InterfaceC9815e
    public final void metrica(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC18303e abstractC18303e = AbstractC18303e.ad;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C10914e.license(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.InterfaceC9815e
    public final String vip(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
