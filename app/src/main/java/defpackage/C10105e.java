package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10105e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object[] f19954e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Context f19955e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C13372e f19956e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f19957e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Context f19958e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f19959e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object[] f19960e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Context f19961e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9402e f19962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10105e(C13372e c13372e, Context context, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f19956e = c13372e;
        this.f19955e = context;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C10105e(this.f19956e, this.f19955e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10105e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object[] objArr;
        C9402e c9402e;
        Object[] objArr2;
        Context context;
        Context context2;
        C13372e c13372e = this.f19956e;
        AudioTrack audioTrack = c13372e.f26633e;
        int i = this.f19959e;
        int i2 = R.string.bitrate_result;
        Context context3 = this.f19955e;
        try {
        } catch (Exception e) {
            e.printStackTrace();
            AbstractC15615e.ad(new C1478e(0, context3, context3.getString(R.string.bitrate_error)));
        }
        if (i != 0) {
            if (i == 1) {
                AbstractC2003e.purchase(obj);
                MediaFormat mediaFormat = (MediaFormat) obj;
                AbstractC15615e.ad(new C1478e(0, context3, context3.getString(R.string.bitrate_result, new Integer(mediaFormat.getInteger("bitrate") / 1000), String.valueOf(mediaFormat.getInteger("sample-rate")))));
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f19957e;
            objArr = this.f19960e;
            context = this.f19958e;
            context2 = this.f19961e;
            c9402e = this.f19962e;
            objArr2 = this.f19954e;
            AbstractC2003e.purchase(obj);
            objArr[0] = obj;
            objArr2[1] = "N/A";
            String string = context.getString(i2, objArr2);
            c9402e.getClass();
            AbstractC15615e.ad(new C1478e(0, context2, string));
            return Unit.INSTANCE;
        }
        AbstractC2003e.purchase(obj);
        C11794e.f23667e.getClass();
        boolean isVip = audioTrack.isVip();
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (isVip) {
            int i3 = audioTrack.vip;
            long j = audioTrack.metrica;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('_');
            sb.append(i3);
            String sb2 = sb.toString();
            C4199e m4502e = C18353e.vip.m4502e();
            CachedTrack cachedTrack = m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null;
            if (cachedTrack != null && cachedTrack.firebase()) {
                ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
                C18474e c18474e = new C18474e(c13372e, null, 26);
                this.f19959e = 1;
                obj = AbstractC5336e.advert(executorC3603e, c18474e, this);
                if (obj == enumC2821e) {
                    return enumC2821e;
                }
                MediaFormat mediaFormat2 = (MediaFormat) obj;
                AbstractC15615e.ad(new C1478e(0, context3, context3.getString(R.string.bitrate_result, new Integer(mediaFormat2.getInteger("bitrate") / 1000), String.valueOf(mediaFormat2.getInteger("sample-rate")))));
                return Unit.INSTANCE;
            }
        }
        C9402e c9402e2 = C9402e.ad;
        objArr = new Object[2];
        C11047e c11047e = C11047e.f21921e;
        this.f19954e = objArr;
        this.f19962e = c9402e2;
        this.f19961e = context3;
        this.f19958e = context3;
        this.f19960e = objArr;
        this.f19957e = R.string.bitrate_result;
        this.f19959e = 2;
        Object mopub = c11047e.mopub(audioTrack, this);
        if (mopub != enumC2821e) {
            c9402e = c9402e2;
            objArr2 = objArr;
            obj = mopub;
            context = context3;
            context2 = context;
            objArr[0] = obj;
            objArr2[1] = "N/A";
            String string2 = context.getString(i2, objArr2);
            c9402e.getClass();
            AbstractC15615e.ad(new C1478e(0, context2, string2));
            return Unit.INSTANCE;
        }
        return enumC2821e;
    }
}
