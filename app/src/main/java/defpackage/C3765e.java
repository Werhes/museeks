package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3765e extends C7819e {
    @Override // defpackage.C7819e
    public final Typeface advert(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.billing, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.smaato.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.C7819e
    public final Method loadAd(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
