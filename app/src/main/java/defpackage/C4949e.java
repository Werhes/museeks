package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4949e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f10465e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f10466e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12988e f10467e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f10468e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10469e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10470e;

    public /* synthetic */ C4949e(long j, C15096e c15096e, C12988e c12988e, C11078e c11078e, Context context) {
        this.f10466e = j;
        this.f10468e = c15096e;
        this.f10467e = c12988e;
        this.f10470e = c11078e;
        this.f10465e = context;
    }

    public /* synthetic */ C4949e(C12988e c12988e, C4017e c4017e, long j, C15096e c15096e, Context context) {
        this.f10467e = c12988e;
        this.f10470e = c4017e;
        this.f10466e = j;
        this.f10468e = c15096e;
        this.f10465e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11, types: [eؓۦۚ] */
    /* JADX WARN: Type inference failed for: r26v8, types: [long] */
    /* JADX WARN: Type inference failed for: r2v17, types: [eّٜٝ] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [eّٜٝ] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2235e interfaceC2235e;
        char c;
        long j;
        InterfaceC2235e interfaceC2235e2;
        InterfaceC2235e interfaceC2235e3;
        int i = this.f10469e;
        Object obj2 = this.f10470e;
        switch (i) {
            case 0:
                AbstractC4457e abstractC4457e = (AbstractC4457e) obj2;
                InterfaceC2235e interfaceC2235e4 = (InterfaceC2235e) obj;
                long j2 = this.f10466e;
                long j3 = j2 ^ (-9223372034707292160L);
                long yandex = interfaceC2235e4.yandex();
                C15096e c15096e = this.f10468e;
                long yandex2 = C2108e.yandex(c15096e.f29883e, yandex);
                C12988e c12988e = this.f10467e;
                C11447e c11447e = null;
                C15074e c15074e = c12988e.ad;
                Object obj3 = AbstractC15384e.ad;
                AbstractC1798e.yandex(interfaceC2235e4, j3, yandex2, c15074e.f29835e != null, new C13749e(13, c12988e));
                long yandex3 = interfaceC2235e4.yandex();
                float f = 2;
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)), 0.0f) * f;
                C15074e c15074e2 = c15074e;
                float max2 = Math.max(Float.intBitsToFloat((int) (j2 & 4294967295L)), 0.0f) * f;
                float intBitsToFloat = Float.intBitsToFloat((int) (yandex3 >> 32)) + max;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (yandex3 & 4294967295L)) + max2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                float appmetrica = AbstractC15384e.appmetrica(c15074e2);
                long j4 = j2;
                if (appmetrica > 0.0f) {
                    ?? r26 = (((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
                    c = ' ';
                    Context context = this.f10465e;
                    j = 4294967297L;
                    if (r26 != 0 || C2152e.vip(j3, 0L)) {
                        interfaceC2235e = interfaceC2235e4;
                        C16089e c16089e = AbstractC12685e.ad;
                        ?? r2 = (C12618e) c16089e.f31681e;
                        C12618e c12618e = (C12618e) c16089e.f31681e;
                        if (r2.startapp()) {
                            ?? purchase = r2.purchase();
                            r2.smaato(purchase);
                            c11447e = purchase;
                        }
                        C11447e c11447e2 = c11447e;
                        if (c11447e2 == null) {
                            c11447e2 = AbstractC17331e.vip();
                        }
                        C11447e c11447e3 = c11447e2;
                        try {
                            c11447e3.ad.setAntiAlias(true);
                            c11447e3.metrica(AbstractC3062e.vip(appmetrica, 0.0f, 1.0f));
                            Bitmap smaato = AbstractC14380e.smaato(context);
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            BitmapShader bitmapShader = new BitmapShader(smaato, tileMode, tileMode);
                            float f2 = c15096e.f29883e;
                            if (f2 <= 0.0f) {
                                f2 = 1.0f;
                            }
                            if (Math.abs(f2 - 1.0f) >= 0.001f) {
                                Matrix matrix = new Matrix();
                                float f3 = 1.0f / f2;
                                matrix.setScale(f3, f3);
                                bitmapShader.setLocalMatrix(matrix);
                            }
                            c11447e3.startapp(bitmapShader);
                            c11447e3.license(9);
                            interfaceC2235e.mo782finally().m4557this().startapp(AbstractC18489e.billing(0L, floatToRawIntBits), c11447e3);
                            Unit unit = Unit.INSTANCE;
                            c11447e3.ad.reset();
                            if (c12618e.license < 3) {
                                c12618e.advert(c11447e3);
                            }
                        } catch (Throwable th) {
                            c11447e3.ad.reset();
                            if (c12618e.license < 3) {
                                c12618e.advert(c11447e3);
                            }
                            throw th;
                        }
                    } else {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        ((C5389e) interfaceC2235e4.mo782finally().f36228e).m1898this(intBitsToFloat2, intBitsToFloat3);
                        try {
                            C16089e c16089e2 = AbstractC12685e.ad;
                            ?? r8 = (C12618e) c16089e2.f31681e;
                            if (r8.startapp()) {
                                ?? purchase2 = r8.purchase();
                                r8.smaato(purchase2);
                                c11447e = purchase2;
                            }
                            C11447e c11447e4 = c11447e;
                            if (c11447e4 == null) {
                                c11447e4 = AbstractC17331e.vip();
                            }
                            C11447e c11447e5 = c11447e4;
                            try {
                                try {
                                    c11447e5.ad.setAntiAlias(true);
                                    c11447e5.metrica(AbstractC3062e.vip(appmetrica, 0.0f, 1.0f));
                                    Bitmap smaato2 = AbstractC14380e.smaato(context);
                                    Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                                    BitmapShader bitmapShader2 = new BitmapShader(smaato2, tileMode2, tileMode2);
                                    float f4 = c15096e.f29883e;
                                    if (f4 <= 0.0f) {
                                        f4 = 1.0f;
                                    }
                                    if (Math.abs(f4 - 1.0f) >= 0.001f) {
                                        Matrix matrix2 = new Matrix();
                                        float f5 = 1.0f / f4;
                                        matrix2.setScale(f5, f5);
                                        bitmapShader2.setLocalMatrix(matrix2);
                                    }
                                    c11447e5.startapp(bitmapShader2);
                                    c11447e5.license(9);
                                    interfaceC2235e = interfaceC2235e4;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    interfaceC2235e4.mo782finally().m4557this().startapp(AbstractC18489e.billing(0L, floatToRawIntBits), c11447e5);
                                    Unit unit2 = Unit.INSTANCE;
                                    c11447e5.ad.reset();
                                    C12618e c12618e2 = (C12618e) c16089e2.f31681e;
                                    if (c12618e2.license < 3) {
                                        c12618e2.advert(c11447e5);
                                    }
                                    ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-intBitsToFloat2, -intBitsToFloat3);
                                    floatToRawIntBits = floatToRawIntBits;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c11447e5.ad.reset();
                                    C12618e c12618e3 = (C12618e) c16089e2.f31681e;
                                    if (c12618e3.license < 3) {
                                        c12618e3.advert(c11447e5);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                ((C5389e) r26.mo782finally().f36228e).m1898this(-intBitsToFloat2, -intBitsToFloat3);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r26 = interfaceC2235e4;
                        }
                    }
                } else {
                    interfaceC2235e = interfaceC2235e4;
                    c = ' ';
                    j = 4294967297L;
                }
                if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - j) & (-9223372034707292160L)) != 0 || C2152e.vip(j3, 0L)) {
                    interfaceC2235e2 = interfaceC2235e;
                    Iterator it = AbstractC15384e.purchase(c15074e2).iterator();
                    while (it.hasNext()) {
                        AbstractC1798e.startapp(interfaceC2235e2, (C10810e) it.next(), c15074e2, j4, floatToRawIntBits, abstractC4457e);
                    }
                } else {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> c));
                    float intBitsToFloat5 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                    ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(intBitsToFloat4, intBitsToFloat5);
                    try {
                        Iterator it2 = AbstractC15384e.purchase(c15074e2).iterator();
                        while (it2.hasNext()) {
                            C15074e c15074e3 = c15074e2;
                            long j5 = j4;
                            interfaceC2235e3 = interfaceC2235e;
                            try {
                                AbstractC1798e.startapp(interfaceC2235e3, (C10810e) it2.next(), c15074e3, j5, floatToRawIntBits, abstractC4457e);
                                interfaceC2235e = interfaceC2235e3;
                                c15074e2 = c15074e3;
                                j4 = j5;
                            } catch (Throwable th6) {
                                th = th6;
                                ((C5389e) interfaceC2235e3.mo782finally().f36228e).m1898this(-intBitsToFloat4, -intBitsToFloat5);
                                throw th;
                            }
                        }
                        interfaceC2235e2 = interfaceC2235e;
                        ((C5389e) interfaceC2235e2.mo782finally().f36228e).m1898this(-intBitsToFloat4, -intBitsToFloat5);
                    } catch (Throwable th7) {
                        th = th7;
                        interfaceC2235e3 = interfaceC2235e;
                    }
                }
                if (abstractC4457e != null) {
                    AbstractC4653e.admob(interfaceC2235e2, abstractC4457e, 0L, interfaceC2235e2.yandex(), 0.0f, null, null, 6, 58);
                }
                return Unit.INSTANCE;
            default:
                C4017e c4017e = (C4017e) obj2;
                C16446e c16446e = (C16446e) obj;
                C12988e c12988e2 = this.f10467e;
                C15074e c15074e4 = c12988e2.ad;
                c16446e.purchase(c15074e4.f29851e);
                Object obj4 = AbstractC15384e.ad;
                c16446e.billing(c15074e4.f29835e != null);
                C7127e c7127e = c15074e4.f29843e;
                C11078e vip = c7127e != null ? C8738e.vip(c7127e) : null;
                if (vip != null) {
                    InterfaceC3828e interfaceC3828e = c16446e.ad;
                    if (interfaceC3828e.smaato() != 1) {
                        interfaceC3828e.mo279interface(1);
                    }
                }
                c4017e.remoteconfig(AbstractC8116e.yandex(c4017e.yandex()), c16446e, new C4949e(this.f10466e, this.f10468e, c12988e2, vip, this.f10465e));
                C17138e.metrica(c4017e, c16446e);
                return Unit.INSTANCE;
        }
    }
}
