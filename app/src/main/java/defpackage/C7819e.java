package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C7819e extends C18293e {
    public final Method adcel;
    public final Method advert;
    public final Class billing;
    public final Method mopub;
    public final Method smaato;
    public final Method startapp;
    public final Constructor yandex;

    public C7819e() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = amazon(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = loadAd(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.billing = cls;
        this.yandex = constructor;
        this.startapp = method2;
        this.adcel = method3;
        this.mopub = method4;
        this.advert = method5;
        this.smaato = method;
    }

    public static Method amazon(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Typeface advert(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.billing, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.smaato.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.C18293e, defpackage.AbstractC15203e
    public final Typeface license(Context context, C14959e[] c14959eArr, int i) {
        Object obj;
        Typeface advert;
        boolean z;
        if (c14959eArr.length >= 1) {
            Method method = this.startapp;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (C14959e c14959e : c14959eArr) {
                        if (c14959e.purchase == 0) {
                            Uri uri = c14959e.ad;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, AbstractC16994e.advert(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
                    try {
                        obj = this.yandex.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = c14959eArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.advert;
                            if (i2 < length) {
                                C14959e c14959e2 = c14959eArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c14959e2.ad);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.adcel.invoke(obj, byteBuffer, Integer.valueOf(c14959e2.vip), null, Integer.valueOf(c14959e2.metrica), Integer.valueOf(c14959e2.license ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (smaato(obj) && (advert = advert(obj)) != null) {
                                return Typeface.create(advert, i);
                            }
                        }
                    }
                } else {
                    C14959e yandex = AbstractC15203e.yandex(c14959eArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(yandex.ad, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(yandex.metrica).setItalic(yandex.license).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    } else if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    public Method loadAd(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.C18293e, defpackage.AbstractC15203e
    public final Typeface metrica(Context context, C13078e c13078e, Resources resources, int i) {
        Object obj;
        Method method = this.startapp;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.metrica(context, c13078e, resources, i);
        }
        try {
            obj = this.yandex.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C18523e[] c18523eArr = c13078e.ad;
            int length = c18523eArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C18523e c18523e = c18523eArr[i2];
                    Context context2 = context;
                    if (mopub(context2, obj, c18523e.ad, c18523e.appmetrica, c18523e.vip, c18523e.metrica ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c18523e.license))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.advert.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (smaato(obj)) {
                    return advert(obj);
                }
            }
        }
        return null;
    }

    public final boolean mopub(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.startapp.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface purchase(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.startapp;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.purchase(context, resources, i, str, i2);
        }
        try {
            obj = this.yandex.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!mopub(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.advert.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (smaato(obj)) {
                return advert(obj);
            }
        }
        return null;
    }

    public final boolean smaato(Object obj) {
        try {
            return ((Boolean) this.mopub.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
