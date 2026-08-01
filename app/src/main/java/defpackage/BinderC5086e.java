package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC5086e extends AbstractBinderC0175e implements InterfaceC11208e {
    public BarhopperV3 appmetrica;
    public final C15573e license;
    public final Context metrica;
    public static final int[] purchase = {5, 7, 7, 7, 5, 5};
    public static final double[][] billing = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    public BinderC5086e(Context context, C15573e c15573e) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.metrica = context;
        this.license = c15573e;
    }

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public static C12194e m1738e(C12126e c12126e, String str, String str2) {
        if (c12126e == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C12194e(c12126e.remoteconfig(), c12126e.admob(), c12126e.amazon(), c12126e.loadAd(), c12126e.Signature(), c12126e.subscription(), c12126e.signatures(), matcher.find() ? matcher.group(1) : null);
    }

    @Override // defpackage.AbstractBinderC0175e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            remoteconfig();
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            BarhopperV3 barhopperV3 = this.appmetrica;
            if (barhopperV3 != null) {
                barhopperV3.close();
                this.appmetrica = null;
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            InterfaceC15751e m1404e = BinderC3838e.m1404e(parcel.readStrongBinder());
            C4931e c4931e = (C4931e) AbstractC17383e.ad(parcel, C4931e.CREATOR);
            AbstractC17383e.vip(parcel);
            RecognitionOptions recognitionOptions = new RecognitionOptions();
            C15573e c15573e = this.license;
            recognitionOptions.ad(c15573e.f30740e);
            recognitionOptions.purchase(c15573e.f30739e);
            recognitionOptions.vip();
            recognitionOptions.metrica();
            ArrayList m1740e = m1740e(m1404e, c4931e, recognitionOptions);
            parcel2.writeNoException();
            parcel2.writeTypedList(m1740e);
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            AbstractC17383e.vip(parcel);
            remoteconfig();
            parcel2.writeNoException();
            return true;
        }
        InterfaceC15751e m1404e2 = BinderC3838e.m1404e(parcel.readStrongBinder());
        C4931e c4931e2 = (C4931e) AbstractC17383e.ad(parcel, C4931e.CREATOR);
        C4326e c4326e = (C4326e) AbstractC17383e.ad(parcel, C4326e.CREATOR);
        AbstractC17383e.vip(parcel);
        RecognitionOptions recognitionOptions2 = new RecognitionOptions();
        C15573e c15573e2 = this.license;
        recognitionOptions2.ad(c15573e2.f30740e);
        recognitionOptions2.purchase(c15573e2.f30739e);
        recognitionOptions2.vip();
        recognitionOptions2.metrica();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.ad(c4326e.f9460e.f31033e);
        C15759e c15759e = c4326e.f9460e;
        multiScaleDecodingOptions.vip(c15759e.f31032e);
        multiScaleDecodingOptions.metrica(c15759e.f31031e);
        recognitionOptions2.license(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.ad(c15759e.f31033e);
        recognitionOptions2.appmetrica(multiScaleDetectionOptions);
        recognitionOptions2.billing(c4326e.f9458e);
        ArrayList m1740e2 = m1740e(m1404e2, c4931e2, recognitionOptions2);
        parcel2.writeNoException();
        parcel2.writeTypedList(m1740e2);
        return true;
    }

    /* renamed from: eؚؑ۟, reason: contains not printable characters */
    public final C15260e m1739e(ByteBuffer byteBuffer, C4931e c4931e, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = this.appmetrica;
        AbstractC9528e.startapp(barhopperV3);
        AbstractC9528e.startapp(byteBuffer);
        if (byteBuffer.isDirect()) {
            return barhopperV3.license(c4931e.f10435e, c4931e.f10434e, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.purchase(c4931e.f10435e, c4931e.f10434e, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.purchase(c4931e.f10435e, c4931e.f10434e, bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    /* renamed from: eٍۡ, reason: contains not printable characters */
    public final java.util.ArrayList m1740e(defpackage.InterfaceC15751e r57, defpackage.C4931e r58, com.google.android.libraries.barhopper.RecognitionOptions r59) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BinderC5086e.m1740e(eؚٕ۟, eٖؗۡ, com.google.android.libraries.barhopper.RecognitionOptions):java.util.ArrayList");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.libraries.barhopper.BarhopperV3, java.lang.Object] */
    public final void remoteconfig() {
        Context context = this.metrica;
        if (this.appmetrica != null) {
            return;
        }
        ?? obj = new Object();
        System.loadLibrary("barhopper_v3");
        this.appmetrica = obj;
        C1868e amazon = C11178e.amazon();
        C12418e amazon2 = C2153e.amazon();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            C11233e amazon3 = C0461e.amazon();
            amazon3.appmetrica();
            C0461e.subscription((C0461e) amazon3.f30493e, i);
            amazon3.appmetrica();
            C0461e.loadAd((C0461e) amazon3.f30493e, i);
            for (int i4 = 0; i4 < purchase[i3]; i4++) {
                double[] dArr = billing[i2];
                double d = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d;
                amazon3.appmetrica();
                C0461e.Signature((C0461e) amazon3.f30493e, f / sqrt);
                amazon3.appmetrica();
                C0461e.admob((C0461e) amazon3.f30493e, f * sqrt);
                i2++;
            }
            i += i;
            amazon2.appmetrica();
            C2153e.loadAd((C2153e) amazon2.f30493e, (C0461e) amazon3.vip());
        }
        amazon.appmetrica();
        C11178e.loadAd((C11178e) amazon.f30493e, (C2153e) amazon2.vip());
        try {
            InputStream open = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = this.appmetrica;
                        AbstractC9528e.startapp(barhopperV3);
                        C3642e amazon4 = C4110e.amazon();
                        AbstractC13532e premium = AbstractC13532e.premium(open);
                        amazon.appmetrica();
                        C11178e.Signature((C11178e) amazon.f30493e, premium);
                        amazon4.appmetrica();
                        C4110e.loadAd((C4110e) amazon4.f30493e, (C11178e) amazon.vip());
                        C13873e amazon5 = C6550e.amazon();
                        AbstractC13532e premium2 = AbstractC13532e.premium(open2);
                        amazon5.appmetrica();
                        C6550e.Signature((C6550e) amazon5.f30493e, premium2);
                        AbstractC13532e premium3 = AbstractC13532e.premium(open3);
                        amazon5.appmetrica();
                        C6550e.loadAd((C6550e) amazon5.f30493e, premium3);
                        amazon4.appmetrica();
                        C4110e.Signature((C4110e) amazon4.f30493e, (C6550e) amazon5.vip());
                        barhopperV3.ad((C4110e) amazon4.vip());
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to open Barcode models", e);
        }
    }
}
