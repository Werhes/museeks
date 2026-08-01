package defpackage;

import android.content.res.TypedArray;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5812e {
    public static final Field ad;

    static {
        try {
            Field declaredField = TypedArray.class.getDeclaredField("mData");
            ad = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
