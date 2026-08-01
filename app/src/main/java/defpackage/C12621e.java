package defpackage;

import android.content.Context;
import android.media.Rating;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٝۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12621e implements InterfaceC10488e {
    public final Context ad;
    public C17974e adcel;
    public boolean advert;
    public final C1861e appmetrica;
    public final Bundle billing;
    public final C0222e license;
    public boolean loadAd;
    public final C7543e metrica;
    public boolean mopub;
    public final InterfaceC14343e purchase;
    public C5891e startapp;
    public final C12318e vip;
    public C13798e smaato = new C13798e();
    public C13798e amazon = new C13798e();
    public C2532e Signature = new C2532e(18);
    public final long yandex = 100;
    public long admob = -9223372036854775807L;
    public long subscription = -9223372036854775807L;

    public C12621e(Context context, C12318e c12318e, C7543e c7543e, Bundle bundle, Looper looper, InterfaceC14343e interfaceC14343e) {
        this.license = new C0222e(looper, C17381e.ad, new C8796e(this));
        this.ad = context;
        this.vip = c12318e;
        this.appmetrica = new C1861e(this, looper);
        this.metrica = c7543e;
        this.billing = bundle;
        this.purchase = interfaceC14343e;
        C1410e c1410e = C1410e.f4222e;
    }

    public static C0101e appmetrica(int i, C1962e c1962e, long j, boolean z) {
        return new C0101e(null, i, c1962e, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    public static C4820e metrica(C4820e c4820e) {
        if (c4820e == null) {
            return null;
        }
        if (c4820e.f10273e > 0.0f) {
            return c4820e;
        }
        AbstractC2803e.smaato("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = c4820e.f10268e;
        long j2 = c4820e.f10266e;
        int i = c4820e.f10277e;
        CharSequence charSequence = c4820e.f10276e;
        AbstractCollection abstractCollection = c4820e.f10274e;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new C4820e(c4820e.f10275e, c4820e.f10270e, j, 1.0f, j2, i, charSequence, c4820e.f10271e, arrayList, c4820e.f10269e, c4820e.f10272e);
    }

    public static List vip(ArrayList arrayList) {
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        C3168e c3168e = AbstractC1008e.ad;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC10488e
    public final void Signature(C4194e c4194e) {
        if (!c4194e.equals(isVip())) {
            C2411e appmetrica = ((C2411e) this.Signature.f6388e).appmetrica(c4194e);
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(appmetrica, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        this.startapp.m1998native().mo3744strictfp(c4194e.ad);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: abstract */
    public final long mo1522abstract() {
        return getDuration();
    }

    public final void ad(int i, List list) {
        ArrayList arrayList = new ArrayList();
        RunnableC11063e runnableC11063e = new RunnableC11063e(this, new AtomicInteger(0), list, arrayList, i, 0);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((C1962e) list.get(i2)).license.mopub;
            if (bArr == null) {
                arrayList.add(null);
                runnableC11063e.run();
            } else {
                ListenableFuture smaato = this.purchase.smaato(bArr);
                arrayList.add(smaato);
                Handler handler = this.vip.f24699e;
                Objects.requireNonNull(handler);
                smaato.ad(runnableC11063e, new ExecutorC17160e(0, handler));
            }
        }
    }

    public final void adcel() {
        C11501e c11501e = new C11501e();
        AbstractC2301e.subscription(mopub() && !((C2411e) this.Signature.f6388e).adcel.Signature());
        C2411e c2411e = (C2411e) this.Signature.f6388e;
        C8814e c8814e = (C8814e) c2411e.adcel;
        int i = c2411e.metrica.ad.vip;
        c8814e.smaato(i, c11501e, 0L);
        C1962e c1962e = c11501e.metrica;
        if (c8814e.subscription(i) == -1) {
            C13325e c13325e = c1962e.purchase;
            String str = c1962e.ad;
            if (c13325e.ad != null) {
                if (((C2411e) this.Signature.f6388e).tapsense) {
                    C13935e m1998native = this.startapp.m1998native();
                    Uri uri = c13325e.ad;
                    Bundle bundle = c13325e.metrica;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) m1998native.f27641e).playFromUri(uri, bundle);
                } else {
                    C13935e m1998native2 = this.startapp.m1998native();
                    Uri uri2 = c13325e.ad;
                    Bundle bundle2 = c13325e.metrica;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    m1998native2.mo408default(uri2, bundle2);
                }
            } else if (c13325e.vip != null) {
                if (((C2411e) this.Signature.f6388e).tapsense) {
                    C13935e m1998native3 = this.startapp.m1998native();
                    String str2 = c13325e.vip;
                    Bundle bundle3 = c13325e.metrica;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) m1998native3.f27641e).playFromSearch(str2, bundle3);
                } else {
                    C13935e m1998native4 = this.startapp.m1998native();
                    String str3 = c13325e.vip;
                    Bundle bundle4 = c13325e.metrica;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    m1998native4.mo406abstract(str3, bundle4);
                }
            } else if (((C2411e) this.Signature.f6388e).tapsense) {
                C13935e m1998native5 = this.startapp.m1998native();
                Bundle bundle5 = c13325e.metrica;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                ((MediaController.TransportControls) m1998native5.f27641e).playFromMediaId(str, bundle5);
            } else {
                C13935e m1998native6 = this.startapp.m1998native();
                Bundle bundle6 = c13325e.metrica;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                m1998native6.mo407break(str, bundle6);
            }
        } else if (((C2411e) this.Signature.f6388e).tapsense) {
            ((MediaController.TransportControls) this.startapp.m1998native().f27641e).play();
        } else {
            this.startapp.m1998native().mo409protected();
        }
        if (((C2411e) this.Signature.f6388e).metrica.ad.purchase != 0) {
            ((MediaController.TransportControls) this.startapp.m1998native().f27641e).seekTo(((C2411e) this.Signature.f6388e).metrica.ad.purchase);
        }
        if (((C5298e) this.Signature.f6385e).ad(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < c8814e.loadAd(); i2++) {
                if (i2 != i && c8814e.subscription(i2) == -1) {
                    c8814e.smaato(i2, c11501e, 0L);
                    arrayList.add(c11501e.metrica);
                }
            }
            ad(0, arrayList);
        }
    }

    @Override // defpackage.InterfaceC10488e
    public final void admob(long j) {
        amazon(mo1581e(), j);
    }

    @Override // defpackage.InterfaceC10488e
    public final long ads() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void advert() {
        /*
            r13 = this;
            boolean r0 = r13.mopub
            if (r0 != 0) goto Lc7
            boolean r0 = r13.advert
            if (r0 == 0) goto La
            goto Lc7
        La:
            r1 = 1
            r13.advert = r1
            eٓؗۦ r2 = new eٓؗۦ
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            eِۛ r3 = r0.ad()
            eؘٟۚ r0 = r13.startapp
            eِؗٛ r0 = r0.m1995goto()
            eِؗٛ r4 = metrica(r0)
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            android.media.session.MediaController r0 = r0.ad
            android.media.MediaMetadata r0 = r0.getMetadata()
            r5 = 0
            if (r0 == 0) goto L4d
            eؓۨۖ r6 = defpackage.C3737e.f8321e
            android.os.Parcel r6 = android.os.Parcel.obtain()
            r7 = 0
            r0.writeToParcel(r6, r7)
            r6.setDataPosition(r7)
            android.os.Parcelable$Creator<eؕۥؒ> r7 = defpackage.C3737e.CREATOR
            java.lang.Object r7 = r7.createFromParcel(r6)
            eؕۥؒ r7 = (defpackage.C3737e) r7
            r6.recycle()
            r7.f8323e = r0
            goto L4e
        L4d:
            r7 = r5
        L4e:
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            android.media.session.MediaController r0 = r0.ad
            java.util.List r0 = r0.getQueue()
            if (r0 == 0) goto L60
            java.util.ArrayList r5 = defpackage.C17638e.ad(r0)
        L60:
            java.util.List r6 = vip(r5)
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            android.media.session.MediaController r0 = r0.ad
            java.lang.CharSequence r5 = r0.getQueueTitle()
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            eٓؕۖ r0 = r0.appmetrica
            eٖٗۧ r0 = r0.ad()
            r8 = -1
            java.lang.String r9 = "MediaControllerCompat"
            if (r0 == 0) goto L90
            int r0 = r0.startapp()     // Catch: java.lang.SecurityException -> L88 android.os.RemoteException -> L8a
            r10 = r8
            r8 = r0
            goto L91
        L88:
            r0 = move-exception
            goto L8b
        L8a:
            r0 = move-exception
        L8b:
            java.lang.String r10 = "Dead object in getRepeatMode."
            defpackage.AbstractC2803e.billing(r9, r10, r0)
        L90:
            r10 = r8
        L91:
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            eٓؕۖ r0 = r0.appmetrica
            eٖٗۧ r0 = r0.ad()
            if (r0 == 0) goto Lad
            int r0 = r0.isVip()     // Catch: java.lang.SecurityException -> La5 android.os.RemoteException -> La7
            r9 = r0
            goto Lae
        La5:
            r0 = move-exception
            goto La8
        La7:
            r0 = move-exception
        La8:
            java.lang.String r11 = "Dead object in getShuffleMode."
            defpackage.AbstractC2803e.billing(r9, r11, r0)
        Lad:
            r9 = r10
        Lae:
            eؘٟۚ r0 = r13.startapp
            java.lang.Object r0 = r0.f12440e
            eٌٍَ r0 = (defpackage.C8603e) r0
            android.media.session.MediaController r0 = r0.ad
            android.os.Bundle r0 = r0.getExtras()
            android.os.Bundle r10 = defpackage.AbstractC9413e.Signature(r0)
            r12 = r7
            r7 = r5
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r13.yandex(r1, r2)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12621e.advert():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void amazon(int r38, long r39) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12621e.amazon(int, long):void");
    }

    @Override // defpackage.InterfaceC10488e
    public final boolean applovin() {
        return ((C2411e) this.Signature.f6388e).metrica.vip;
    }

    @Override // defpackage.InterfaceC10488e
    public final int billing() {
        return ((C2411e) this.Signature.f6388e).ads;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: break */
    public final int mo1523break() {
        return -1;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: case */
    public final void mo1524case() {
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).skipToPrevious();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: catch */
    public final float mo1525catch() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: class */
    public final void mo1526class(C1962e c1962e, long j) {
        mo1557e(0, j, AbstractC17475e.ads(c1962e));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: continue */
    public final void mo1528continue() {
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).skipToPrevious();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: default */
    public final int mo1529default() {
        return mo1581e();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: else */
    public final void mo1530else(int i) {
        mo1609throws(i, i + 1);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eَؑۨ */
    public final void mo1531e(int i, int i2, int i3) {
        AbstractC2301e.billing(i >= 0 && i <= i2 && i3 >= 0);
        C8814e c8814e = (C8814e) ((C2411e) this.Signature.f6388e).adcel;
        int loadAd = c8814e.loadAd();
        int min = Math.min(i2, loadAd);
        int i4 = min - i;
        int i5 = loadAd - i4;
        int i6 = i5 - 1;
        int min2 = Math.min(i3, i5);
        if (i >= loadAd || i == min || i == min2) {
            return;
        }
        int mo1581e = mo1581e();
        if (mo1581e >= i) {
            mo1581e = mo1581e < min ? -1 : mo1581e - i4;
        }
        if (mo1581e == -1) {
            mo1581e = AbstractC9413e.adcel(i, 0, i6);
            AbstractC2803e.smaato("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + mo1581e + " would be the new current item");
        }
        if (mo1581e >= min2) {
            mo1581e += i4;
        }
        ArrayList arrayList = new ArrayList(c8814e.appmetrica);
        AbstractC9413e.m2554implements(arrayList, i, min, min2);
        C2411e smaato = ((C2411e) this.Signature.f6388e).smaato(new C8814e(AbstractC17475e.remoteconfig(arrayList), c8814e.purchase), mo1581e);
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(smaato, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        if (mopub()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList2.add((C17638e) ((List) this.smaato.f27352e).get(i));
                this.startapp.m1989abstract(((C17638e) ((List) this.smaato.f27352e).get(i)).f34568e);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.startapp.isPro(((C17638e) arrayList2.get(i8)).f34568e, i8 + min2);
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eۣؑۡ */
    public final AbstractC17475e mo1532e() {
        return (AbstractC17475e) this.Signature.f6387e;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؑۥؘ */
    public final void mo1533e(int i, List list) {
        AbstractC2301e.billing(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        C8814e c8814e = (C8814e) ((C2411e) this.Signature.f6388e).adcel;
        if (c8814e.Signature()) {
            mo1557e(0, -9223372036854775807L, list);
            return;
        }
        int min = Math.min(i, mo1571e().loadAd());
        C8814e admob = c8814e.admob(min, list);
        int mo1581e = mo1581e();
        int size = list.size();
        if (mo1581e >= min) {
            mo1581e += size;
        }
        C2411e smaato = ((C2411e) this.Signature.f6388e).smaato(admob, mo1581e);
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(smaato, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        if (mopub()) {
            ad(min, list);
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒ٘ؗ */
    public final long mo1534e() {
        long metrica = AbstractC1008e.metrica((C2411e) this.Signature.f6388e, this.admob, this.subscription, this.vip.f24706e);
        this.admob = metrica;
        return metrica;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒٚۨ */
    public final void mo1535e() {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support muting the player");
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒۖۗ */
    public final C9039e mo1537e() {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support getting Cue");
        return C9039e.license;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؒۤۨ */
    public final long mo1538e() {
        return mo1534e();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّؔٞ */
    public final void mo1539e(List list) {
        mo1557e(0, -9223372036854775807L, list);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eِؕٛ */
    public final void mo1540e() {
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).fastForward();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘْؖ */
    public final void mo1541e() {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support unmuting the player");
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍؖۙ */
    public final boolean mo1542e() {
        C2411e c2411e = (C2411e) this.Signature.f6388e;
        if (c2411e.remoteconfig.ad == 1) {
            return c2411e.signatures;
        }
        C5891e c5891e = this.startapp;
        if (c5891e == null) {
            return false;
        }
        C18368e ad = ((C8603e) c5891e.f12440e).ad();
        AbstractC12614e abstractC12614e = AbstractC13256e.ad;
        return ad != null && ad.license == 0;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌؖۡ */
    public final void mo1544e() {
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).skipToNext();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘؕۥ */
    public final boolean mo1545e() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘُٔ */
    public final C12053e mo1546e() {
        return ((C2411e) this.Signature.f6388e).smaato;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘٕۚ */
    public final void mo1547e(boolean z) {
        mo1605super(1, z);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙؙٝ */
    public final C6689e mo1548e() {
        return (C6689e) this.Signature.f6386e;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍؙّ */
    public final C12053e mo1549e() {
        C1962e remoteconfig = ((C2411e) this.Signature.f6388e).remoteconfig();
        return remoteconfig == null ? C12053e.f24142throw : remoteconfig.license;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙۛ۠ */
    public final Bundle mo1550e() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؚؚؓ */
    public final int mo1551e() {
        return -1;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؚٜ۠ */
    public final boolean mo1552e() {
        return ((C2411e) this.Signature.f6388e).startapp;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؚۜؑ */
    public final void mo1553e(C3335e c3335e, boolean z) {
        AbstractC2803e.smaato("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eًًؓ */
    public final void mo1554e(int i) {
        amazon(i, 0L);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌؙٞ */
    public final void mo1556e() {
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).rewind();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌۘۤ */
    public final void mo1557e(int i, long j, List list) {
        if (list.isEmpty()) {
            mo1608this();
            return;
        }
        C2411e amazon = ((C2411e) this.Signature.f6388e).amazon(C8814e.billing.admob(0, list), new C12693e(appmetrica(i, (C1962e) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(amazon, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        if (mopub()) {
            adcel();
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌۡٔ */
    public final void mo1558e(int i, C1962e c1962e) {
        mo1533e(i, Collections.singletonList(c1962e));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍؓۙ */
    public final void mo1559e(int i) {
        mo1598package(i, 1);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eَٖٓ */
    public final void mo1560e(C12053e c12053e) {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eُٓؓ */
    public final long mo1561e() {
        return ((C2411e) this.Signature.f6388e).metrica.appmetrica;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eُؚٕ */
    public final long mo1562e() {
        return ((C2411e) this.Signature.f6388e).crashlytics;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eِؗؓ */
    public final int mo1564e() {
        return -1;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙِۡ */
    public final void mo1565e(List list) {
        mo1533e(Alert.DURATION_SHOW_INDEFINITELY, list);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّّۚ */
    public final void mo1566e(C1962e c1962e) {
        mo1567e(c1962e);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّْٝ */
    public final void mo1567e(C1962e c1962e) {
        mo1526class(c1962e, -9223372036854775807L);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّ۟ٝ */
    public final void mo1568e() {
        C7543e c7543e = this.metrica;
        int ad = c7543e.ad.ad();
        C12318e c12318e = this.vip;
        if (ad != 0) {
            c12318e.vip(new RunnableC3630e(this, 1));
            return;
        }
        Object subs = c7543e.ad.subs();
        subs.getClass();
        c12318e.vip(new RunnableC7410e(this, (C13765e) subs, 5));
        c12318e.f24699e.postDelayed(new RunnableC3630e(this, 0), 500L);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eًْٕ */
    public final C4491e mo1569e() {
        return C4491e.f9732native;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eْٗۚ */
    public final ListenableFuture mo1570e(String str, C11326e c11326e) {
        CharSequence charSequence = ((C3737e) this.smaato.f27345e).f8324e.getCharSequence("android.media.metadata.MEDIA_ID");
        if (str.equals(charSequence != null ? charSequence.toString() : null)) {
            ((MediaController.TransportControls) this.startapp.m1998native().f27641e).setRating((Rating) AbstractC13256e.subscription(c11326e).vip());
        }
        return AbstractC2017e.license(new C9759e(0));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eْۢؕ */
    public final AbstractC6690e mo1571e() {
        return ((C2411e) this.Signature.f6388e).adcel;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eْۥؑ */
    public final ListenableFuture mo1572e(C11858e c11858e, Bundle bundle) {
        Bundle bundle2 = c11858e.metrica;
        if (this.startapp == null) {
            return AbstractC2017e.license(new C9759e(-100));
        }
        if (bundle.isEmpty()) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        this.startapp.m1998native().m3734final(c11858e.vip, bundle);
        return AbstractC2017e.license(new C9759e(0));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍٓۢ */
    public final int mo1573e() {
        return 0;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٓٛۢ */
    public final boolean mo1575e() {
        return ((C2411e) this.Signature.f6388e).inmobi;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٔؖۘ */
    public final void mo1576e() {
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).skipToNext();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٌٔٗ */
    public final void mo1577e(int i, C1962e c1962e) {
        mo1603static(i, i + 1, AbstractC17475e.ads(c1962e));
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّٔؖ */
    public final void mo1578e(int i) {
        int isPro = isPro() - 1;
        if (isPro >= mo1597new().vip) {
            C2411e metrica = ((C2411e) this.Signature.f6388e).metrica(isPro, mo1542e());
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(metrica, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        ((C8603e) this.startapp.f12440e).ad.adjustVolume(-1, i);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eّٔؗ */
    public final long mo1579e() {
        return ((C2411e) this.Signature.f6388e).subs;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٍٟٔ */
    public final boolean mo1580e() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٕؓٝ */
    public final int mo1581e() {
        return ((C2411e) this.Signature.f6388e).metrica.ad.vip;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٕٙؗ */
    public final long mo1582e() {
        return mo1561e();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؘٖؗ */
    public final void mo1583e(int i, int i2) {
        mo1531e(i, i + 1, i2);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٖٔۧ */
    public final void mo1584e() {
        mo1610transient(1);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eٟٗۦ */
    public final C18255e mo1586e() {
        return C18255e.vip;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: e٘ٔ٘ */
    public final void mo1587e(InterfaceC8524e interfaceC8524e) {
        this.license.appmetrica(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: eؙٟ٘ */
    public final void mo1588e(boolean z) {
        C2411e c2411e = (C2411e) this.Signature.f6388e;
        if (c2411e.tapsense == z) {
            return;
        }
        this.admob = AbstractC1008e.metrica(c2411e, this.admob, this.subscription, this.vip.f24706e);
        this.subscription = SystemClock.elapsedRealtime();
        C2411e license = ((C2411e) this.Signature.f6388e).license(1, 0, z);
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(license, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        if (!mopub() || ((C2411e) this.Signature.f6388e).adcel.Signature()) {
            return;
        }
        if (z) {
            ((MediaController.TransportControls) this.startapp.m1998native().f27641e).play();
        } else {
            ((MediaController.TransportControls) this.startapp.m1998native().f27641e).pause();
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: final */
    public final void mo1590final() {
        amazon(mo1581e(), 0L);
    }

    @Override // defpackage.InterfaceC10488e
    public final C5298e firebase() {
        return (C5298e) this.Signature.f6385e;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: for */
    public final void mo1591for(float f) {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // defpackage.InterfaceC10488e
    public final long getDuration() {
        return ((C2411e) this.Signature.f6388e).metrica.license;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: implements */
    public final C2351e mo1592implements() {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support getting VideoSize");
        return C2351e.license;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: import */
    public final int mo1593import() {
        return -1;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: interface */
    public final boolean mo1595interface() {
        return ((C2411e) this.Signature.f6388e).tapsense;
    }

    @Override // defpackage.InterfaceC10488e
    public final int isPro() {
        C2411e c2411e = (C2411e) this.Signature.f6388e;
        if (c2411e.remoteconfig.ad == 1) {
            return c2411e.pro;
        }
        C5891e c5891e = this.startapp;
        if (c5891e == null) {
            return 0;
        }
        C18368e ad = ((C8603e) c5891e.f12440e).ad();
        AbstractC12614e abstractC12614e = AbstractC13256e.ad;
        if (ad == null) {
            return 0;
        }
        return ad.license;
    }

    @Override // defpackage.InterfaceC10488e
    public final C4194e isVip() {
        return ((C2411e) this.Signature.f6388e).billing;
    }

    @Override // defpackage.InterfaceC10488e
    public final void license() {
        C2411e c2411e = (C2411e) this.Signature.f6388e;
        if (c2411e.ads != 1) {
            return;
        }
        C2411e purchase = c2411e.purchase(c2411e.adcel.Signature() ? 4 : 2, null);
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(purchase, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        if (((C2411e) this.Signature.f6388e).adcel.Signature()) {
            return;
        }
        adcel();
    }

    @Override // defpackage.InterfaceC10488e
    public final void loadAd() {
        mo1588e(false);
    }

    public final boolean mopub() {
        return ((C2411e) this.Signature.f6388e).ads != 1;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: native */
    public final void mo1596native(boolean z) {
        if (z != mo1552e()) {
            C2411e mopub = ((C2411e) this.Signature.f6388e).mopub(z);
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(mopub, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        C13935e m1998native = this.startapp.m1998native();
        AbstractC12614e abstractC12614e = AbstractC13256e.ad;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z ? 1 : 0);
        m1998native.m3734final("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: new */
    public final C5251e mo1597new() {
        return ((C2411e) this.Signature.f6388e).remoteconfig;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: package */
    public final void mo1598package(int i, int i2) {
        C5251e mo1597new = mo1597new();
        int i3 = mo1597new.vip;
        int i4 = mo1597new.metrica;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            C2411e metrica = ((C2411e) this.Signature.f6388e).metrica(i, mo1542e());
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(metrica, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        ((C8603e) this.startapp.f12440e).ad.setVolumeTo(i, i2);
    }

    @Override // defpackage.InterfaceC10488e
    public final long premium() {
        return ((C2411e) this.Signature.f6388e).metrica.billing;
    }

    @Override // defpackage.InterfaceC10488e
    public final void pro() {
        mo1588e(true);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: protected */
    public final void mo1600protected(InterfaceC8524e interfaceC8524e) {
        this.license.ad(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: public */
    public final C8256e mo1601public() {
        return ((C2411e) this.Signature.f6388e).ad;
    }

    @Override // defpackage.InterfaceC10488e
    public final void purchase(float f) {
        if (f != isVip().ad) {
            C2411e appmetrica = ((C2411e) this.Signature.f6388e).appmetrica(new C4194e(f));
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(appmetrica, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        this.startapp.m1998native().mo3744strictfp(f);
    }

    @Override // defpackage.InterfaceC10488e
    public final void release() {
        Messenger messenger;
        if (this.mopub) {
            return;
        }
        this.mopub = true;
        C17974e c17974e = this.adcel;
        if (c17974e != null) {
            C13265e c13265e = (C13265e) c17974e.f35233e;
            C11883e c11883e = c13265e.purchase;
            if (c11883e != null && (messenger = c13265e.billing) != null) {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.arg1 = 1;
                    obtain.replyTo = messenger;
                    ((Messenger) c11883e.f23815e).send(obtain);
                } catch (RemoteException unused) {
                    AbstractC2803e.advert("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            c13265e.vip.disconnect();
            this.adcel = null;
        }
        C5891e c5891e = this.startapp;
        if (c5891e != null) {
            Set set = (Set) c5891e.f12439e;
            C1861e c1861e = this.appmetrica;
            if (set.remove(c1861e)) {
                try {
                    ((C8603e) c5891e.f12440e).metrica(c1861e);
                } finally {
                    c1861e.license(null);
                }
            } else {
                AbstractC2803e.smaato("MediaControllerCompat", "the callback has never been registered");
            }
            c1861e.license.removeCallbacksAndMessages(null);
            this.startapp = null;
        }
        this.advert = false;
        this.license.license();
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00cc, code lost:
    
        if (r11 == r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (android.text.TextUtils.equals(r4.f10276e, r15.f10276e) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remoteconfig(boolean r18, defpackage.C13798e r19, boolean r20, final defpackage.C2532e r21, java.lang.Integer r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12621e.remoteconfig(boolean, eٓؗۦ, boolean, eِّؔ, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // defpackage.InterfaceC10488e
    public final void signatures(int i) {
        if (i != startapp()) {
            C2411e startapp = ((C2411e) this.Signature.f6388e).startapp(i);
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(startapp, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        C13935e m1998native = this.startapp.m1998native();
        int Signature = AbstractC13256e.Signature(i);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", Signature);
        m1998native.m3734final("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override // defpackage.InterfaceC10488e
    public final C3335e smaato() {
        return ((C2411e) this.Signature.f6388e).admob;
    }

    @Override // defpackage.InterfaceC10488e
    public final int startapp() {
        return ((C2411e) this.Signature.f6388e).yandex;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: static */
    public final void mo1603static(int i, int i2, List list) {
        AbstractC2301e.billing(i >= 0 && i <= i2);
        int loadAd = ((C8814e) ((C2411e) this.Signature.f6388e).adcel).loadAd();
        if (i > loadAd) {
            return;
        }
        int min = Math.min(i2, loadAd);
        mo1533e(min, list);
        mo1609throws(i, min);
    }

    @Override // defpackage.InterfaceC10488e
    public final void stop() {
        C2411e c2411e = (C2411e) this.Signature.f6388e;
        if (c2411e.ads == 1) {
            return;
        }
        C12693e c12693e = c2411e.metrica;
        C0101e c0101e = c12693e.ad;
        boolean z = c12693e.vip;
        long j = c12693e.license;
        long j2 = c0101e.purchase;
        C2411e adcel = c2411e.adcel(new C12693e(c0101e, z, SystemClock.elapsedRealtime(), j, j2, AbstractC1008e.vip(j2, j), 0L, -9223372036854775807L, j, j2));
        C2411e c2411e2 = (C2411e) this.Signature.f6388e;
        if (c2411e2.ads != 1) {
            adcel = adcel.purchase(1, c2411e2.ad);
        }
        C2411e c2411e3 = adcel;
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(c2411e3, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        ((MediaController.TransportControls) this.startapp.m1998native().f27641e).stop();
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: strictfp */
    public final void mo1604strictfp() {
        mo1578e(1);
    }

    @Override // defpackage.InterfaceC10488e
    public final void subs(int i, long j) {
        amazon(i, j);
    }

    @Override // defpackage.InterfaceC10488e
    public final boolean subscription() {
        return false;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: super */
    public final void mo1605super(int i, boolean z) {
        if (z != mo1542e()) {
            C2411e metrica = ((C2411e) this.Signature.f6388e).metrica(isPro(), z);
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(metrica, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        ((C8603e) this.startapp.f12440e).ad.adjustVolume(z ? -100 : 100, i);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: synchronized */
    public final void mo1607synchronized(C4491e c4491e) {
    }

    public final void tapsense(C2532e c2532e, Integer num, Integer num2) {
        remoteconfig(false, this.smaato, false, c2532e, num, num2);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: this */
    public final void mo1608this() {
        mo1609throws(0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eّۗؐ, eْٗۤ] */
    @Override // defpackage.InterfaceC10488e
    /* renamed from: throws */
    public final void mo1609throws(int i, int i2) {
        AbstractC2301e.billing(i >= 0 && i2 >= i);
        int loadAd = mo1571e().loadAd();
        int min = Math.min(i2, loadAd);
        if (i >= loadAd || i == min) {
            return;
        }
        C8814e c8814e = (C8814e) ((C2411e) this.Signature.f6388e).adcel;
        c8814e.getClass();
        ?? abstractC12670e = new AbstractC12670e(4);
        AbstractC17475e abstractC17475e = c8814e.appmetrica;
        abstractC12670e.license(abstractC17475e.subList(0, i));
        abstractC12670e.license(abstractC17475e.subList(min, abstractC17475e.size()));
        C8814e c8814e2 = new C8814e(abstractC12670e.billing(), c8814e.purchase);
        int mo1581e = mo1581e();
        int i3 = min - i;
        if (mo1581e >= i) {
            mo1581e = mo1581e < min ? -1 : mo1581e - i3;
        }
        if (mo1581e == -1) {
            mo1581e = AbstractC9413e.adcel(i, 0, c8814e2.loadAd() - 1);
            AbstractC2803e.smaato("MCImplLegacy", "Currently playing item is removed. Assumes item at " + mo1581e + " is the new current item");
        }
        C2411e smaato = ((C2411e) this.Signature.f6388e).smaato(c8814e2, mo1581e);
        C2532e c2532e = this.Signature;
        tapsense(new C2532e(smaato, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        if (mopub()) {
            while (i < min && i < ((List) this.smaato.f27352e).size()) {
                this.startapp.m1989abstract(((C17638e) ((List) this.smaato.f27352e).get(i)).f34568e);
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: transient */
    public final void mo1610transient(int i) {
        int isPro = isPro();
        int i2 = mo1597new().metrica;
        if (i2 == 0 || isPro + 1 <= i2) {
            C2411e metrica = ((C2411e) this.Signature.f6388e).metrica(isPro + 1, mo1542e());
            C2532e c2532e = this.Signature;
            tapsense(new C2532e(metrica, (C6689e) c2532e.f6386e, (C5298e) c2532e.f6385e, (AbstractC17475e) c2532e.f6387e, (Bundle) c2532e.f6384e, (C4960e) null), null, null);
        }
        ((C8603e) this.startapp.f12440e).ad.adjustVolume(1, i);
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: try */
    public final long mo1611try() {
        return ((C2411e) this.Signature.f6388e).firebase;
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: volatile */
    public final void mo1612volatile(SurfaceHolder surfaceHolder) {
        AbstractC2803e.smaato("MCImplLegacy", "Session doesn't support setting SurfaceHolder");
    }

    @Override // defpackage.InterfaceC10488e
    /* renamed from: while */
    public final int mo1613while() {
        return ((C2411e) this.Signature.f6388e).metrica.purchase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x06ca, code lost:
    
        if (r11 != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x06cc, code lost:
    
        r10 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x06ce, code lost:
    
        if (r11 != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0360, code lost:
    
        if (r34 != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0368, code lost:
    
        if (defpackage.AbstractC13256e.isPro(r11, 512) == false) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0806 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x083f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0695 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0360  */
    /* JADX WARN: Type inference failed for: r11v10, types: [eّۗؐ, eْٗۤ] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(boolean r81, defpackage.C13798e r82) {
        /*
            Method dump skipped, instructions count: 2342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12621e.yandex(boolean, eٓؗۦ):void");
    }
}
