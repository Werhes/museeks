package defpackage;

import android.media.MediaCodecInfo;
import android.util.Range;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597e extends Cpackage implements InterfaceC18315e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C13410e f2807e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final MediaCodecInfo.VideoCapabilities f2808e;

    public C0597e(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        this.f2808e = ((MediaCodecInfo.CodecCapabilities) this.f36443e).getVideoCapabilities();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public final boolean mo379e(int i, int i2) {
        return this.f2808e.isSizeSupported(i, i2);
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eؑۧٝ, reason: contains not printable characters */
    public final Range mo380e(int i) {
        try {
            return this.f2808e.getSupportedHeightsFor(i);
        } finally {
        }
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eَُؗ, reason: contains not printable characters */
    public final Range mo381e(int i) {
        try {
            return this.f2808e.getSupportedWidthsFor(i);
        } finally {
        }
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public final int mo382e() {
        return this.f2808e.getWidthAlignment();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eٍ٘ۛ, reason: contains not printable characters */
    public final Range mo383e() {
        return this.f2808e.getSupportedHeights();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eؘُٗ, reason: contains not printable characters */
    public final Range mo384e() {
        return this.f2808e.getBitrateRange();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eِْ۠, reason: contains not printable characters */
    public final boolean mo385e() {
        return true;
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eّ۟ٝ, reason: contains not printable characters */
    public final boolean mo386e(int i, int i2) {
        return mo379e(i, i2) || mo379e(i2, i);
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eٓؒؔ, reason: contains not printable characters */
    public final int mo387e() {
        return this.f2808e.getHeightAlignment();
    }

    @Override // defpackage.InterfaceC18315e
    /* renamed from: eَۣ٘, reason: contains not printable characters */
    public final Range mo388e() {
        return this.f2808e.getSupportedWidths();
    }
}
