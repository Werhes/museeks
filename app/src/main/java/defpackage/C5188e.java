package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ۟ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5188e {
    public static final Object adcel = new Object();
    public static volatile C5188e mopub;
    public final ReentrantReadWriteLock ad;
    public final C9231e appmetrica;
    public final C5438e billing;
    public final Handler license;
    public volatile int metrica;
    public final InterfaceC12379e purchase;
    public final C13090e startapp;
    public final C17548e vip;
    public final int yandex;

    public C5188e(C15097e c15097e) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.ad = reentrantReadWriteLock;
        this.metrica = 3;
        InterfaceC12379e interfaceC12379e = (InterfaceC12379e) c15097e.vip;
        this.purchase = interfaceC12379e;
        int i = c15097e.ad;
        this.yandex = i;
        this.startapp = (C13090e) c15097e.metrica;
        this.license = new Handler(Looper.getMainLooper());
        this.vip = new C17548e(0);
        this.billing = new C5438e(29);
        C9231e c9231e = new C9231e(this);
        this.appmetrica = c9231e;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.metrica = 0;
            } catch (Throwable th) {
                this.ad.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (metrica() == 0) {
            try {
                interfaceC12379e.purchase(new C7418e(c9231e));
            } catch (Throwable th2) {
                purchase(th2);
            }
        }
    }

    public static C5188e ad() {
        C5188e c5188e;
        synchronized (adcel) {
            c5188e = mopub;
            AbstractC4265e.yandex("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", c5188e != null);
        }
        return c5188e;
    }

    public static boolean license() {
        return mopub != null;
    }

    public final void appmetrica() {
        AbstractC4265e.yandex("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.yandex == 1);
        if (metrica() == 1) {
            return;
        }
        this.ad.writeLock().lock();
        try {
            if (this.metrica == 0) {
                return;
            }
            this.metrica = 0;
            this.ad.writeLock().unlock();
            C9231e c9231e = this.appmetrica;
            C5188e c5188e = (C5188e) c9231e.ad;
            try {
                c5188e.purchase.purchase(new C7418e(c9231e));
            } catch (Throwable th) {
                c5188e.purchase(th);
            }
        } finally {
            this.ad.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:79:0x0066, B:82:0x006b, B:84:0x006f, B:86:0x007c, B:32:0x009b, B:34:0x00a5, B:36:0x00a8, B:38:0x00ab, B:40:0x00bb, B:41:0x00be), top: B:78:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, eٍؑۥ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence billing(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5188e.billing(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final int metrica() {
        this.ad.readLock().lock();
        try {
            return this.metrica;
        } finally {
            this.ad.readLock().unlock();
        }
    }

    public final void purchase(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.ad.writeLock().lock();
        try {
            this.metrica = 2;
            arrayList.addAll(this.vip);
            this.vip.clear();
            this.ad.writeLock().unlock();
            this.license.post(new RunnableC9280e(arrayList, this.metrica, th));
        } catch (Throwable th2) {
            this.ad.writeLock().unlock();
            throw th2;
        }
    }

    public final void startapp(EditorInfo editorInfo) {
        if (metrica() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C9231e c9231e = this.appmetrica;
        c9231e.getClass();
        Bundle bundle = editorInfo.extras;
        C6927e c6927e = (C6927e) ((C11980e) c9231e.metrica).f23950e;
        int ad = c6927e.ad(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", ad != 0 ? ((ByteBuffer) c6927e.f8352e).getInt(ad + c6927e.f8353e) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public final int vip(CharSequence charSequence, int i) {
        AbstractC4265e.yandex("Not initialized yet", metrica() == 1);
        AbstractC4265e.billing(charSequence, "charSequence cannot be null");
        C18478e c18478e = (C18478e) this.appmetrica.vip;
        c18478e.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C2205e[] c2205eArr = (C2205e[]) spanned.getSpans(i, i + 1, C2205e.class);
            if (c2205eArr.length > 0) {
                return spanned.getSpanStart(c2205eArr[0]);
            }
        }
        return ((C13071e) c18478e.m4545instanceof(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new C13071e(i))).f26005e;
    }

    public final void yandex(AbstractC11696e abstractC11696e) {
        AbstractC4265e.billing(abstractC11696e, "initCallback cannot be null");
        this.ad.writeLock().lock();
        try {
            if (this.metrica != 1 && this.metrica != 2) {
                this.vip.add(abstractC11696e);
                this.ad.writeLock().unlock();
            }
            this.license.post(new RunnableC9280e(Arrays.asList(abstractC11696e), this.metrica, (Throwable) null));
            this.ad.writeLock().unlock();
        } catch (Throwable th) {
            this.ad.writeLock().unlock();
            throw th;
        }
    }
}
