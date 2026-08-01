package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14272e extends AbstractC15203e {
    public static int advert(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font startapp(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int advert = advert(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int advert2 = advert(fontStyle, font2.getStyle());
            if (advert2 < advert) {
                font = font2;
                advert = advert2;
            }
        }
        return font;
    }

    public final FontFamily adcel(C14959e[] c14959eArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (C14959e c14959e : c14959eArr) {
            if (!Objects.equals(c14959e.ad.getScheme(), "systemfont")) {
                try {
                    Uri uri = c14959e.ad;
                    str = c14959e.appmetrica;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(c14959e.metrica).setSlant(c14959e.license ? 1 : 0).setTtcIndex(c14959e.vip);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                }
            } else {
                font = mopub(c14959e);
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface appmetrica(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily adcel = adcel((C14959e[]) list.get(0), contentResolver);
            if (adcel == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(adcel);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily adcel2 = adcel((C14959e[]) list.get(i2), contentResolver);
                if (adcel2 != null) {
                    customFallbackBuilder.addCustomFallback(adcel2);
                }
            }
            return customFallbackBuilder.setStyle(startapp(adcel, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface license(Context context, C14959e[] c14959eArr, int i) {
        try {
            FontFamily adcel = adcel(c14959eArr, context.getContentResolver());
            if (adcel == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(adcel).setStyle(startapp(adcel, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface metrica(Context context, C13078e c13078e, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C18523e c18523e : c13078e.ad) {
                try {
                    Font build = new Font.Builder(resources, c18523e.purchase).setWeight(c18523e.vip).setSlant(c18523e.metrica ? 1 : 0).setTtcIndex(c18523e.appmetrica).setFontVariationSettings(c18523e.license).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(startapp(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public Font mopub(C14959e c14959e) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.AbstractC15203e
    public final Typeface purchase(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
