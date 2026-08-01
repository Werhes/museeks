package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7356e {
    public final C10026e ad;
    public final int adcel;
    public final float appmetrica;
    public final float billing;
    public final float license;
    public final float metrica;
    public final int mopub;
    public final float purchase;
    public final int startapp;
    public final C10026e vip = new C10026e();
    public final float yandex;

    public C7356e(Context context) {
        AttributeSet attributeSet;
        int i;
        int next;
        C10026e c10026e = new C10026e();
        int i2 = c10026e.f19823e;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray purchase = AbstractC15787e.purchase(context, attributeSet, AbstractC11408e.metrica, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.metrica = purchase.getDimensionPixelSize(4, -1);
        this.startapp = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.adcel = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.license = purchase.getDimensionPixelSize(14, -1);
        this.appmetrica = purchase.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.billing = purchase.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.purchase = purchase.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.yandex = purchase.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.mopub = purchase.getInt(24, 1);
        C10026e c10026e2 = this.vip;
        int i3 = c10026e.f19821e;
        c10026e2.f19821e = i3 == -2 ? 255 : i3;
        int i4 = c10026e.f19814e;
        if (i4 != -2) {
            c10026e2.f19814e = i4;
        } else if (purchase.hasValue(23)) {
            this.vip.f19814e = purchase.getInt(23, 0);
        } else {
            this.vip.f19814e = -1;
        }
        String str = c10026e.f19801e;
        if (str != null) {
            this.vip.f19801e = str;
        } else if (purchase.hasValue(7)) {
            this.vip.f19801e = purchase.getString(7);
        }
        C10026e c10026e3 = this.vip;
        c10026e3.f19808e = c10026e.f19808e;
        CharSequence charSequence = c10026e.f19809e;
        c10026e3.f19809e = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C10026e c10026e4 = this.vip;
        int i5 = c10026e.f19807e;
        c10026e4.f19807e = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = c10026e.f19804e;
        c10026e4.f19804e = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = c10026e.f19826e;
        c10026e4.f19826e = Boolean.valueOf(bool == null || bool.booleanValue());
        C10026e c10026e5 = this.vip;
        int i7 = c10026e.f19799e;
        c10026e5.f19799e = i7 == -2 ? purchase.getInt(21, -2) : i7;
        C10026e c10026e6 = this.vip;
        int i8 = c10026e.f19798e;
        c10026e6.f19798e = i8 == -2 ? purchase.getInt(22, -2) : i8;
        C10026e c10026e7 = this.vip;
        Integer num = c10026e.f19797e;
        c10026e7.f19797e = Integer.valueOf(num == null ? purchase.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C10026e c10026e8 = this.vip;
        Integer num2 = c10026e.f19825e;
        c10026e8.f19825e = Integer.valueOf(num2 == null ? purchase.getResourceId(6, 0) : num2.intValue());
        C10026e c10026e9 = this.vip;
        Integer num3 = c10026e.f19824e;
        c10026e9.f19824e = Integer.valueOf(num3 == null ? purchase.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C10026e c10026e10 = this.vip;
        Integer num4 = c10026e.f19811e;
        c10026e10.f19811e = Integer.valueOf(num4 == null ? purchase.getResourceId(16, 0) : num4.intValue());
        C10026e c10026e11 = this.vip;
        Integer num5 = c10026e.f19806e;
        c10026e11.f19806e = Integer.valueOf(num5 == null ? AbstractC2774e.license(context, purchase, 1).getDefaultColor() : num5.intValue());
        C10026e c10026e12 = this.vip;
        Integer num6 = c10026e.f19819e;
        c10026e12.f19819e = Integer.valueOf(num6 == null ? purchase.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c10026e.f19800e;
        if (num7 != null) {
            this.vip.f19800e = num7;
        } else if (purchase.hasValue(9)) {
            this.vip.f19800e = Integer.valueOf(AbstractC2774e.license(context, purchase, 9).getDefaultColor());
        } else {
            int intValue = this.vip.f19819e.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, AbstractC11408e.f22939native);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList license = AbstractC2774e.license(context, obtainStyledAttributes, 3);
            AbstractC2774e.license(context, obtainStyledAttributes, 4);
            AbstractC2774e.license(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i9, 0);
            obtainStyledAttributes.getString(i9);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC2774e.license(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, AbstractC11408e.applovin);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.vip.f19800e = Integer.valueOf(license.getDefaultColor());
        }
        C10026e c10026e13 = this.vip;
        Integer num8 = c10026e.f19818e;
        c10026e13.f19818e = Integer.valueOf(num8 == null ? purchase.getInt(2, 8388661) : num8.intValue());
        C10026e c10026e14 = this.vip;
        Integer num9 = c10026e.f19802e;
        c10026e14.f19802e = Integer.valueOf(num9 == null ? purchase.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C10026e c10026e15 = this.vip;
        Integer num10 = c10026e.f19816e;
        c10026e15.f19816e = Integer.valueOf(num10 == null ? purchase.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C10026e c10026e16 = this.vip;
        Integer num11 = c10026e.f19820e;
        c10026e16.f19820e = Integer.valueOf(num11 == null ? purchase.getDimensionPixelOffset(18, 0) : num11.intValue());
        C10026e c10026e17 = this.vip;
        Integer num12 = c10026e.f19822e;
        c10026e17.f19822e = Integer.valueOf(num12 == null ? purchase.getDimensionPixelOffset(25, 0) : num12.intValue());
        C10026e c10026e18 = this.vip;
        Integer num13 = c10026e.f19815e;
        c10026e18.f19815e = Integer.valueOf(num13 == null ? purchase.getDimensionPixelOffset(19, c10026e18.f19820e.intValue()) : num13.intValue());
        C10026e c10026e19 = this.vip;
        Integer num14 = c10026e.f19812e;
        c10026e19.f19812e = Integer.valueOf(num14 == null ? purchase.getDimensionPixelOffset(26, c10026e19.f19822e.intValue()) : num14.intValue());
        C10026e c10026e20 = this.vip;
        Integer num15 = c10026e.f19810e;
        c10026e20.f19810e = Integer.valueOf(num15 == null ? purchase.getDimensionPixelOffset(20, 0) : num15.intValue());
        C10026e c10026e21 = this.vip;
        Integer num16 = c10026e.f19813e;
        c10026e21.f19813e = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C10026e c10026e22 = this.vip;
        Integer num17 = c10026e.f19817e;
        c10026e22.f19817e = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C10026e c10026e23 = this.vip;
        Boolean bool2 = c10026e.f19805e;
        c10026e23.f19805e = Boolean.valueOf(bool2 == null ? purchase.getBoolean(0, false) : bool2.booleanValue());
        purchase.recycle();
        Locale locale = c10026e.f19803e;
        if (locale == null) {
            this.vip.f19803e = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.vip.f19803e = locale;
        }
        this.ad = c10026e;
    }
}
