package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2477e extends AbstractRunnableC6316e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6325e;

    public AbstractC2477e(int i) {
        super(0L, false);
        this.f6325e = i;
    }

    public abstract InterfaceC5083e appmetrica();

    public void license(CancellationException cancellationException) {
    }

    public abstract Object mopub();

    public Throwable purchase(Object obj) {
        C1427e c1427e = obj instanceof C1427e ? (C1427e) obj : null;
        if (c1427e != null) {
            return c1427e.ad;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.InterfaceC10500e) r5.mo397public(defpackage.C4524e.f9798e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            eًؗۖ r0 = r11.appmetrica()     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            eؖؓۜ r0 = (defpackage.C3843e) r0     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            eُؑ۠ r1 = r0.f8480e     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            java.lang.Object r0 = r0.f8482e     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            eٌِٞ r2 = r1.admob()     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            java.lang.Object r0 = defpackage.AbstractC2745e.purchase(r2, r0)     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            eًؚؔ r3 = defpackage.AbstractC2745e.vip     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            eْۜؐ r3 = defpackage.AbstractC6494e.subscription(r1, r2, r0)     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            goto L23
        L1c:
            r0 = move-exception
            goto L8c
        L1f:
            r0 = move-exception
            goto L90
        L22:
            r3 = r4
        L23:
            eٌِٞ r5 = r1.admob()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.mopub()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.purchase(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.f6325e     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            eْؖۧ r4 = defpackage.C4524e.f9798e     // Catch: java.lang.Throwable -> L46
            eؗؒۚ r4 = r5.mo397public(r4)     // Catch: java.lang.Throwable -> L46
            eَٟۙ r4 = (defpackage.InterfaceC10500e) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L80
        L48:
            if (r4 == 0) goto L60
            boolean r5 = r4.purchase()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L60
            java.util.concurrent.CancellationException r4 = r4.mo695implements()     // Catch: java.lang.Throwable -> L46
            r11.license(r4)     // Catch: java.lang.Throwable -> L46
            eّۜۖ r5 = new eّۜۖ     // Catch: java.lang.Throwable -> L46
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r1.billing(r5)     // Catch: java.lang.Throwable -> L46
            goto L72
        L60:
            if (r7 == 0) goto L6b
            eّۜۖ r4 = new eّۜۖ     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.billing(r4)     // Catch: java.lang.Throwable -> L46
            goto L72
        L6b:
            java.lang.Object r4 = r11.yandex(r6)     // Catch: java.lang.Throwable -> L46
            r1.billing(r4)     // Catch: java.lang.Throwable -> L46
        L72:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L7c
            boolean r1 = r3.m3614e()     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            if (r1 == 0) goto L9d
        L7c:
            defpackage.AbstractC2745e.appmetrica(r2, r0)     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.m3614e()     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
            if (r3 == 0) goto L8b
        L88:
            defpackage.AbstractC2745e.appmetrica(r2, r0)     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1c defpackage.C15295e -> L1f
        L8c:
            r11.startapp(r0)
            goto L9d
        L90:
            eًؗۖ r1 = r11.appmetrica()
            eٌِٞ r1 = r1.admob()
            java.lang.Throwable r0 = r0.f30221e
            defpackage.AbstractC15849e.license(r1, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2477e.run():void");
    }

    public final void startapp(Throwable th) {
        AbstractC15849e.license(appmetrica().admob(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public Object yandex(Object obj) {
        return obj;
    }
}
