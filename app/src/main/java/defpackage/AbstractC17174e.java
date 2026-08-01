package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٞۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17174e {
    public static final AbstractC15203e ad;
    public static Paint metrica;
    public static final C4662e vip;

    static {
        Trace.beginSection("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            ad = new AbstractC15203e();
        } else if (i >= 29) {
            ad = new AbstractC15203e();
        } else if (i >= 28) {
            ad = new C7819e();
        } else if (i >= 26) {
            ad = new C7819e();
        } else {
            if (i >= 24) {
                Method method = C6063e.license;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    ad = new AbstractC15203e();
                }
            }
            ad = new AbstractC15203e();
        }
        vip = new C4662e(16);
        metrica = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface ad(Context context, InterfaceC11128e interfaceC11128e, Resources resources, int i, String str, int i2, int i3, AbstractC14437e abstractC14437e, boolean z) {
        Typeface metrica2;
        Typeface build;
        FontFamily build2;
        int i4 = 6;
        int i5 = -3;
        if (interfaceC11128e instanceof C16632e) {
            C16632e c16632e = (C16632e) interfaceC11128e;
            String str2 = c16632e.license;
            metrica2 = null;
            boolean z2 = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (build = metrica(str2)) == null) {
                ArrayList arrayList = c16632e.ad;
                if (arrayList.size() == 1) {
                    build = metrica(((C10359e) arrayList.get(0)).appmetrica);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= arrayList.size()) {
                                        break;
                                    }
                                    C10359e c10359e = (C10359e) arrayList.get(i7);
                                    if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(c10359e.purchase)) {
                                        customFallbackBuilder.setSystemFallback(c10359e.appmetrica);
                                        break;
                                    }
                                    String str3 = c10359e.appmetrica;
                                    String str4 = c10359e.purchase;
                                    Font license = license(metrica(str3));
                                    if (license == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + c10359e.appmetrica + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build2 = new FontFamily.Builder(license).build();
                                    } else {
                                        try {
                                            build2 = new FontFamily.Builder(AbstractC14303e.ad(license).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i7++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (metrica(((C10359e) arrayList.get(i6)).appmetrica) == null) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (abstractC14437e != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC11247e(abstractC14437e, build, i4));
                }
                vip.metrica(vip(resources, i, str, i2, i3), build);
                return build;
            }
            Object[] objArr2 = !z ? abstractC14437e != null : c16632e.metrica != 0;
            int i8 = z ? c16632e.vip : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C0731e c0731e = new C0731e(0);
            c0731e.f3025e = abstractC14437e;
            ArrayList arrayList2 = c16632e.ad;
            ExecutorC6131e executorC6131e = new ExecutorC6131e(handler);
            C17424e c17424e = new C17424e(c0731e, executorC6131e, z2, 8);
            if (objArr2 != true) {
                String ad2 = AbstractC4833e.ad(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC4833e.ad.vip(ad2);
                if (typeface != null) {
                    executorC6131e.execute(new RunnableC17144e(c0731e, typeface, i4));
                    metrica2 = typeface;
                } else {
                    C12631e c12631e = new C12631e(1, c17424e);
                    synchronized (AbstractC4833e.metrica) {
                        try {
                            C17519e c17519e = AbstractC4833e.license;
                            ArrayList arrayList3 = (ArrayList) c17519e.get(ad2);
                            if (arrayList3 != null) {
                                arrayList3.add(c12631e);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c12631e);
                                c17519e.put(ad2, arrayList4);
                                CallableC16209e callableC16209e = new CallableC16209e(ad2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC4833e.vip;
                                C12631e c12631e2 = new C12631e(2, ad2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC11666e runnableC11666e = new RunnableC11666e(4);
                                runnableC11666e.f23445e = callableC16209e;
                                runnableC11666e.f23444e = c12631e2;
                                runnableC11666e.f23446e = handler2;
                                threadPoolExecutor.execute(runnableC11666e);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                C10359e c10359e2 = (C10359e) arrayList2.get(0);
                C4662e c4662e = AbstractC4833e.ad;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{c10359e2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String ad3 = AbstractC4833e.ad(i3, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC4833e.ad.vip(ad3);
                if (typeface2 != null) {
                    executorC6131e.execute(new RunnableC17144e(c0731e, typeface2, i4));
                    metrica2 = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr3 = {c10359e2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr3[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    C14836e vip2 = AbstractC4833e.vip(ad3, context, DesugarCollections.unmodifiableList(arrayList6), i3);
                    c17424e.m4317interface(vip2);
                    metrica2 = vip2.ad;
                } else {
                    try {
                        try {
                            try {
                                C14836e c14836e = (C14836e) AbstractC4833e.vip.submit(new CallableC16209e(ad3, context, c10359e2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                c17424e.m4317interface(c14836e);
                                metrica2 = c14836e.ad;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC6131e) c17424e.f34141e).execute(new RunnableC9280e(c17424e.f34142e, i5, (int) (objArr == true ? 1 : 0)));
                    }
                }
            }
        } else {
            metrica2 = ad.metrica(context, (C13078e) interfaceC11128e, resources, i3);
            if (abstractC14437e != null) {
                if (metrica2 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC11247e(abstractC14437e, metrica2, i4));
                } else {
                    abstractC14437e.ad(-3);
                }
            }
        }
        if (metrica2 != null) {
            vip.metrica(vip(resources, i, str, i2, i3), metrica2);
        }
        return metrica2;
    }

    public static Font license(Typeface typeface) {
        if (metrica == null) {
            metrica = new Paint();
        }
        metrica.setTextSize(10.0f);
        metrica.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, metrica);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }

    public static Typeface metrica(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static String vip(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
