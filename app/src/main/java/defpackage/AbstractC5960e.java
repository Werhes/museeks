package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5960e {
    public static boolean ad = false;
    public static Field license = null;
    public static boolean metrica = false;
    public static Method vip;

    public static final void ad(C14609e c14609e, C13770e c13770e, int i) {
        C14542e yandex;
        c13770e.m3671package(757792307);
        int i2 = (c13770e.purchase(c14609e) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C7913e c7913e = AbstractC18007e.metrica;
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c7913e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC16049e abstractC16049e = c14609e != null ? c14609e.vip : null;
            if (abstractC16049e == null) {
                c13770e.m3676strictfp(-386719101);
                c13770e.Signature(false);
                yandex = null;
            } else {
                c13770e.m3676strictfp(-386719100);
                yandex = yandex(abstractC16049e, (Context) c13770e.adcel(AbstractC2676e.vip), 1, true);
                c13770e.Signature(false);
            }
            AbstractC8461e.vip(yandex, null, c7913e, AbstractC12475e.metrica(R.drawable.generic_audio_nowplaying, 0, c13770e), AbstractC12475e.metrica(R.drawable.generic_audio_nowplaying, 0, c13770e), C16477e.ad, c13770e, 37296, 6, 31712);
            AbstractC12315e.vip(c14609e != null ? c14609e.vip : null, c7913e, c13770e, 48);
            AbstractC17074e.ad(AbstractC16136e.metrica(c7913e, C3618e.vip(0.25f, C3618e.vip), AbstractC10432e.ad), c13770e, 6);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11528e(c14609e, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean adcel(defpackage.InterfaceC3890e r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r7 = r7.purchase(r10)
            return r7
        L10:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L65
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r8 == 0) goto L65
            boolean r1 = defpackage.AbstractC5960e.ad
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.AbstractC5960e.vip = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.AbstractC5960e.ad = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.AbstractC5960e.vip
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r4[r0] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = defpackage.AbstractC2016e.license(r7, r10)
            if (r8 == 0) goto L77
            goto L81
        L77:
            if (r7 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7d:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L81:
            return r3
        L82:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = defpackage.AbstractC5960e.metrica
            if (r7 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L99
            defpackage.AbstractC5960e.license = r7     // Catch: java.lang.NoSuchFieldException -> L99
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            defpackage.AbstractC5960e.metrica = r3
        L9b:
            java.lang.reflect.Field r7 = defpackage.AbstractC5960e.license
            if (r7 == 0) goto La6
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r7 = r2
        La7:
            if (r7 == 0) goto Lb4
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = defpackage.AbstractC2016e.license(r7, r10)
            if (r8 == 0) goto Lca
            goto Ld4
        Lca:
            if (r7 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Ld0:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld4:
            return r3
        Ld5:
            if (r8 == 0) goto Ldd
            boolean r8 = defpackage.AbstractC2016e.license(r8, r10)
            if (r8 != 0) goto Le3
        Ldd:
            boolean r7 = r7.purchase(r10)
            if (r7 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5960e.adcel(eِؖؖ, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static List advert(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? DesugarCollections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appmetrica(final defpackage.C13610e r24, final defpackage.C3177e r25, final kotlin.jvm.functions.Function1 r26, final defpackage.InterfaceC12864e r27, final boolean r28, defpackage.InterfaceC12123e r29, defpackage.InterfaceC16154e r30, defpackage.InterfaceC12864e r31, boolean r32, final defpackage.InterfaceC6340e r33, defpackage.C13770e r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5960e.appmetrica(eْۤ٘, eؘؕٝ, kotlin.jvm.functions.Function1, eّۤۧ, boolean, eِۦۦ, eّٖؖ, eّۤۧ, boolean, eؙُِ, eٓؕۥ, int, int):void");
    }

    public static final String billing(Method method) {
        return method.getName() + AbstractC1660e.m669goto(method.getParameterTypes(), BuildConfig.FLAVOR, "(", ")", C15146e.f29957e, 24) + AbstractC2677e.vip(method.getReturnType());
    }

    public static final void license(AbstractC16049e abstractC16049e, InterfaceC16154e interfaceC16154e, boolean z, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(978949037);
        int i2 = (c13770e.purchase(abstractC16049e) ? 4 : 2) | i | (c13770e.purchase(interfaceC16154e) ? 32 : 16) | (c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            AbstractC17957e.ad(AbstractC12220e.mopub(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16), C5438e.f11700e, AbstractC16653e.license(1895909763, new C11194e(abstractC16049e, interfaceC12864e, interfaceC16154e, z, 1), c13770e), c13770e, 3126, 4);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(abstractC16049e, interfaceC16154e, z, interfaceC12864e, i, 6);
        }
    }

    public static final void metrica(C14609e c14609e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        AbstractC16049e abstractC16049e;
        c13770e.m3671package(2125910541);
        int i2 = (c13770e.purchase(c14609e) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = Boolean.valueOf((c14609e == null || (abstractC16049e = c14609e.vip) == null || !AbstractC13461e.purchase(abstractC16049e)) ? false : true);
                c13770e.m3682throws(m3681throw);
            }
            boolean booleanValue = ((Boolean) m3681throw).booleanValue();
            C7913e c7913e = AbstractC18007e.metrica;
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j = c13770e.f27286case;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c7913e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            vip(c14609e != null ? c14609e.vip : null, booleanValue ? AbstractC16136e.metrica(interfaceC12864e, C3618e.appmetrica, AbstractC10432e.ad) : interfaceC12864e, c13770e, 0);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(c14609e, interfaceC12864e, i, 10);
        }
    }

    public static final boolean mopub(AbstractC16049e abstractC16049e) {
        String vip2;
        if (abstractC16049e instanceof AudioTrack) {
            AudioTrack audioTrack = (AudioTrack) abstractC16049e;
            AudioAlbum audioAlbum = audioTrack.amazon;
            C10675e c10675e = null;
            if ((audioAlbum != null ? audioAlbum.appmetrica : null) != null || AbstractC1786e.appmetrica(audioTrack)) {
                return true;
            }
            if (!audioTrack.firebase) {
                int i = audioTrack.vip;
                long j = audioTrack.metrica;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append('_');
                sb.append(i);
                String sb2 = sb.toString();
                C4199e m4502e = C18353e.vip.m4502e();
                CachedTrack cachedTrack = m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null;
                if (cachedTrack != null) {
                    c10675e = AbstractC12546e.purchase(cachedTrack);
                }
            } else if (audioTrack.f36495goto) {
                c10675e = AbstractC4224e.purchase(3, AbstractC6914e.billing(audioTrack));
            } else if (audioTrack.f36493class) {
                c10675e = AbstractC4224e.purchase(2, AbstractC6914e.billing(audioTrack));
            } else if (audioAlbum != null && (vip2 = audioAlbum.vip()) != null) {
                c10675e = AbstractC4224e.purchase(4, vip2);
            }
            if (c10675e != null) {
                return AbstractC11062e.f21949e.isVip(c10675e);
            }
        } else if (abstractC16049e.getLicense() != null) {
            return true;
        }
        return false;
    }

    public static final void purchase(C10983e c10983e, C13770e c13770e, int i) {
        C10983e c10983e2;
        C13770e c13770e2;
        c13770e.m3671package(1229882433);
        int i2 = (c13770e.purchase(c10983e) ? 4 : 2) | i;
        if (!c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            c10983e2 = c10983e;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        } else if (c10983e == null) {
            c13770e.m3676strictfp(-938283688);
            c13770e.Signature(false);
            c10983e2 = c10983e;
            c13770e2 = c13770e;
        } else {
            c13770e.m3676strictfp(-938283687);
            c10983e2 = c10983e;
            c13770e2 = c13770e;
            AbstractC9180e.vip(c10983e2, null, AbstractC12696e.yandex(750, 6, null), BuildConfig.FLAVOR, AbstractC8508e.ad, c13770e2, 28032, 2);
            c13770e2.Signature(false);
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17689e(c10983e2, i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, eٟؑؐ] */
    public static boolean startapp(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0008e.license;
        C0008e c0008e = (C0008e) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        C0008e c0008e2 = c0008e;
        if (c0008e == null) {
            ?? obj = new Object();
            obj.ad = null;
            obj.vip = null;
            obj.metrica = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c0008e2 = obj;
        }
        WeakReference weakReference2 = c0008e2.metrica;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0008e2.metrica = new WeakReference(keyEvent);
        if (c0008e2.vip == null) {
            c0008e2.vip = new SparseArray();
        }
        SparseArray sparseArray = c0008e2.vip;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final void vip(AbstractC16049e abstractC16049e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C14542e yandex;
        c13770e.m3671package(-1999332557);
        int i2 = (c13770e.purchase(abstractC16049e) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            if (abstractC16049e == null) {
                c13770e.m3676strictfp(490445775);
                c13770e.Signature(false);
                yandex = null;
            } else {
                c13770e.m3676strictfp(490445776);
                yandex = yandex(abstractC16049e, (Context) c13770e.adcel(AbstractC2676e.vip), 5, false);
                c13770e.Signature(false);
            }
            AbstractC8461e.vip(yandex, null, interfaceC12864e, AbstractC12475e.metrica(R.drawable.generic_audio_nowplaying, 0, c13770e), AbstractC12475e.metrica(R.drawable.generic_audio_nowplaying, 0, c13770e), C16477e.vip, c13770e, ((i2 << 3) & 896) | 36912, 6, 31712);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0263e(abstractC16049e, interfaceC12864e, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer] */
    public static final C14542e yandex(AbstractC16049e abstractC16049e, Context context, int i, boolean z) {
        ?? valueOf = Integer.valueOf(R.drawable.generic_audio_nowplaying);
        StringBuilder sb = new StringBuilder("np_");
        sb.append(abstractC16049e != null ? abstractC16049e.Signature() : null);
        sb.append(z ? "_blur" : BuildConfig.FLAVOR);
        String sb2 = sb.toString();
        C5944e c5944e = new C5944e(context);
        c5944e.license(AbstractC8647e.pro(i));
        c5944e.subscription = 2;
        C9061e vip2 = c5944e.vip();
        Boolean bool = Boolean.TRUE;
        vip2.ad(C11106e.f22004e, bool);
        c5944e.vip().ad(C11106e.f22003e, bool);
        if (z) {
            AbstractC2182e.ad(c5944e, false);
            AbstractC15659e.ad(c5944e, false);
            c5944e.vip().ad(AbstractC15659e.billing, Boolean.FALSE);
            AbstractC2182e.metrica(c5944e, new C5939e(C7943e.startapp));
        } else {
            AbstractC2182e.ad(c5944e, true);
            AbstractC15659e.ad(c5944e, true);
            c5944e.vip().ad(AbstractC15659e.billing, Boolean.valueOf(AbstractC0179e.metrica(context)));
        }
        c5944e.smaato = sb2 != null ? new C15695e(sb2, C9139e.f18290e) : null;
        c5944e.appmetrica = sb2;
        if ((!C11425e.ad.ad() && (abstractC16049e == null || !mopub(abstractC16049e))) || abstractC16049e == null) {
            abstractC16049e = valueOf;
        }
        c5944e.metrica = abstractC16049e;
        return c5944e.ad();
    }
}
