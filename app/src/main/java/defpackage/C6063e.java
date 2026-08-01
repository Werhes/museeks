package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6063e extends AbstractC15203e {
    public static final Method appmetrica;
    public static final Method license;
    public static final Constructor metrica;
    public static final Class vip;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        metrica = constructor;
        vip = cls;
        license = method2;
        appmetrica = method;
    }

    public static Typeface adcel(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) vip, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) appmetrica.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean startapp(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) license.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface license(Context context, C14959e[] c14959eArr, int i) {
        Object obj;
        try {
            obj = metrica.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            C17519e c17519e = new C17519e(0);
            int length = c14959eArr.length;
            while (true) {
                if (i2 < length) {
                    C14959e c14959e = c14959eArr[i2];
                    Uri uri = c14959e.ad;
                    ByteBuffer byteBuffer = (ByteBuffer) c17519e.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = AbstractC16994e.advert(context, uri);
                        c17519e.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !startapp(obj, byteBuffer, c14959e.vip, c14959e.metrica, c14959e.license)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface adcel = adcel(obj);
                    if (adcel != null) {
                        return Typeface.create(adcel, i);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface metrica(Context context, C13078e c13078e, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = metrica.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C18523e c18523e : c13078e.ad) {
                int i3 = c18523e.purchase;
                File adcel = AbstractC16994e.adcel(context);
                if (adcel != null) {
                    try {
                        if (AbstractC16994e.license(adcel, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(adcel);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && startapp(obj, mappedByteBuffer, c18523e.appmetrica, c18523e.vip, c18523e.metrica)) ? i2 + 1 : 0;
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        adcel.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return adcel(obj);
        }
        return null;
    }
}
